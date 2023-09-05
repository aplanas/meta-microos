SUMMARY = "openSUSE Tumbleweed branding for LibreOffice"
DESCRIPTION = "openSUSE Tumbleweed branding for LibreOffice"
LICENSE = "BSD-3-Clause"

PV = "84.87.20230227"

RPM_NAME = "libreoffice-branding-openSUSE-84.87.20230227-2.1.noarch.rpm"
RPM_HASH = "f11ddc75866dbbb5f0b89e2b7b190459b1ea7e69d2dec23b385cd70577163c6baf0414f517904b6fdc3e693bfba652d3ca6523e1160e287169569e07979f58ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding \
libreoffice-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm

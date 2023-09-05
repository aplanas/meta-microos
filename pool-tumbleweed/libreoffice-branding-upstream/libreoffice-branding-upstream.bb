SUMMARY = "Original Branding for LibreOffice"
DESCRIPTION = "This package includes the original branding for the LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-branding-upstream-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "b303cb90164598bdb577bc15c4c498ab64b177a0b125edcbb73a81943f04ce22fb2ab7bd1ff007fa4c6de6a488784377d00c557584468254a756d3674913faa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding \
libreoffice-branding-SLE \
libreoffice-branding-openSUSE \
libreoffice-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm

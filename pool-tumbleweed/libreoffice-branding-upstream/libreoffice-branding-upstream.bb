SUMMARY = "Original Branding for LibreOffice"
DESCRIPTION = "This package includes the original branding for the LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-branding-upstream-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "9e19d19b15caf20b451f354f337e0c2d7ed3fd1d68fae9cac176342ab0e226a2ac00e54846b950608533871ca323c429ecda3b5177d787d2cb7eea135b7d7cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding \
libreoffice-branding-SLE \
libreoffice-branding-openSUSE \
libreoffice-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm

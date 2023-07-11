SUMMARY = "Original Branding for LibreOffice"
DESCRIPTION = "This package includes the original branding for the LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-branding-upstream-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "6355968e8fd5c12cfb5142478d5d4f14e59fd143e0b98e70dfb7ab8db02fed8d4c78fd9cfe59eccda455ab56e299349476af84e401ef0ad4bb0d0f3b09d091f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding \
libreoffice-branding-SLE \
libreoffice-branding-openSUSE \
libreoffice-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm

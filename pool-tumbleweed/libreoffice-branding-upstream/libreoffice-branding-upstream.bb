SUMMARY = "Original Branding for LibreOffice"
DESCRIPTION = "This package includes the original branding for the LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-branding-upstream-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "7ada4bc2ef2fc0bef7765d6f2e4c183e6bfa2a76f1fcc89df8d74a17c2b2d8800d76adaaa9a230b0099963055b6002d41cdbc9ea2753e637437e09d9249a561d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding \
libreoffice-branding-SLE \
libreoffice-branding-openSUSE \
libreoffice-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm

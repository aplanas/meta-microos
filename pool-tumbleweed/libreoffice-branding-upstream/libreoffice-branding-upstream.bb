SUMMARY = "Original Branding for LibreOffice"
DESCRIPTION = "This package includes the original branding for the LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-branding-upstream-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "467bde1769b9fb61721691752b8b4e9184f8c2aa51d0ee94f88a981027701b0650bc3bf6b91c3f751edfbbc528f6827c841981a4021c27e8c6935c105a00a6a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding \
libreoffice-branding-SLE \
libreoffice-branding-openSUSE \
libreoffice-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm

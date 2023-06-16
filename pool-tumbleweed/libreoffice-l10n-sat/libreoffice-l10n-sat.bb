SUMMARY = "Santali localization files for LibreOffice"
DESCRIPTION = "Provides Santali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sat-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "eed41206f26530106f6f3800bc79dc2734371aa9307b44c6a11899ed5b10217a0381264ac297cac9a7752469927babe878c20548ed6406f58c906f5690942001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sat \
libreoffice-l10n-sat \
locale-libreoffice-sat"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

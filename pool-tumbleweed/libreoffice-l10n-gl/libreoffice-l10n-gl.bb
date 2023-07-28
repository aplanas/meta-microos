SUMMARY = "Galician localization files for LibreOffice"
DESCRIPTION = "Provides Galician translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-gl-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "2d6623348823eac6eeea57efa34329acd322456e7444faf35a5ddc4667d1b36f5584d2449844176ffc6b9ad993289b5ceaa05de5824567a2ff4b02c16d8c32ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gl \
libreoffice-l10n-gl \
locale-libreoffice-gl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gl"

inherit rpm

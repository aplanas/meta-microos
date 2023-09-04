SUMMARY = "Romanian localization files for LibreOffice"
DESCRIPTION = "Provides Romanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ro-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "3f31397c11720b5d231c4e4410be354865630d62c5f7939a5a660b38535eae99de67bc06a3f8fc71698744f6347a6262504e6a676a5014ca168bda653ffb3e1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ro \
libreoffice-l10n-ro \
locale-libreoffice-ro"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ro"

inherit rpm

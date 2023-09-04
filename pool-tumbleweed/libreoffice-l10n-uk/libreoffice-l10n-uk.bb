SUMMARY = "Ukrainian localization files for LibreOffice"
DESCRIPTION = "Provides Ukrainian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-uk-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "3d1ed5503c2e65ad38b5951ee0abaecbce77fa9e18fd3007748f1f1ac5f873ddc3129fe533fe83eafa0d3d8e565928a3d948b7a2bbde3fa155dcb5f28f961d12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uk \
libreoffice-l10n-uk \
locale-libreoffice-uk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-uk-UA"

inherit rpm

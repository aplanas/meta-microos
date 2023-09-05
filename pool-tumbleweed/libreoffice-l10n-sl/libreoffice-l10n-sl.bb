SUMMARY = "Slovenian localization files for LibreOffice"
DESCRIPTION = "Provides Slovenian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-sl-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "7a791504ff806112d0f032046ca580876f268bc5b5648cc7cdc103e671ca05b488e8cee1f9c9d4b2094dad619323a71cc1cc848dbf19363bbf9eb53ad1a4e7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sl \
libreoffice-l10n-sl \
locale-libreoffice-sl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sl-SI"

inherit rpm

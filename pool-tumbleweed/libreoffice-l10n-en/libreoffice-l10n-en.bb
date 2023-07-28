SUMMARY = "English localization files for LibreOffice"
DESCRIPTION = "Provides English translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-en-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "8e27be40444548ebf9b298e92a753ad9c08bd5f8eeee11fac71f10752da8503879eef086e8c1dfc9fd8efc6d2d4dda5b2357192dcd93d1a21ceecbb1203f7841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en \
libreoffice-help-en-US \
libreoffice-l10n-en \
locale-libreoffice-en"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en"

inherit rpm

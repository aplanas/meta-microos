SUMMARY = "Icelandic localization files for LibreOffice"
DESCRIPTION = "Provides Icelandic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-is-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "9795ac8e48f8376c880439002f9f1b39953679a8f935037b187e8f1ec14d75843d60ab95a17d5077880b1c7aa893dc5f91964a4b403d1b7425b365d42b615a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-is \
libreoffice-l10n-is \
locale-libreoffice-is"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-is"

inherit rpm

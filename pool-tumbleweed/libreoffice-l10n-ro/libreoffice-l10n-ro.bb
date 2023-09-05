SUMMARY = "Romanian localization files for LibreOffice"
DESCRIPTION = "Provides Romanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ro-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "65a382b9a4be8c160221b7923d7ecae529b7d36390ca3ad6a76a3f8f78df49a288d6405c2272e0483910299b846b1eac17c180fa86b58b462355d437f3f06c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ro \
libreoffice-l10n-ro \
locale-libreoffice-ro"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ro"

inherit rpm

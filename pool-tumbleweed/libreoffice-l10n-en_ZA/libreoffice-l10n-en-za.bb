SUMMARY = "English_ZA localization files for LibreOffice"
DESCRIPTION = "Provides English_ZA translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-en_ZA-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "923eedbc76042122fa3cbd44a68f41da12a68baf9a821d673d1363dfb28e7437af4ee7ec18a8aa765bb920177ff3aaab76bb45874b83c1cf5e7312b953534284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-ZA \
libreoffice-l10n-en-ZA \
locale-libreoffice-en-ZA"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-ZA"

inherit rpm

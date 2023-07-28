SUMMARY = "Ukrainian localization files for LibreOffice"
DESCRIPTION = "Provides Ukrainian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-uk-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "3b435eb6e9a02b51e17f8f4b7c20baec5a5d5d80c8a14fd41d55dc15d1c452b186fdd4c6f53547c42fd1385f78324df112400eb85fab4b9bd7b49c5a0effde41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uk \
libreoffice-l10n-uk \
locale-libreoffice-uk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-uk-UA"

inherit rpm

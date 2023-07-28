SUMMARY = "Afrikaans localization files for LibreOffice"
DESCRIPTION = "Provides Afrikaans translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-af-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "1c6370f500f8abd4eaa6c0392a0bc41e0403e530475fce0cb13c1d5ece55be734b4824ccc3ad3c13077747649f7f56b68de85935bdd6f1cffbf1df300abba683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-af \
libreoffice-l10n-af \
locale-libreoffice-af"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-af-ZA"

inherit rpm

SUMMARY = "Bengali localization files for LibreOffice"
DESCRIPTION = "Provides Bengali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-bn-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "95dfaeff98628b97aa85dca85c0427f2b22afc1eb98570cc2e8c0db50b991b1b07795a6f76d696fa4b76d6a91c7ccd9c836d5240731f5d200b74cf8ad99520f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn \
libreoffice-l10n-bn \
locale(libreoffice:bn)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn_BD"

inherit rpm

SUMMARY = "Czech localization files for LibreOffice"
DESCRIPTION = "Provides Czech translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-cs-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "03f111e3f0e761d2b831da389ff51f8d5501d8106ed9bd9b86ecb9e26591b66a03ba2628ff9b0c739ab1ee3e22a7fb762b5212ec52e7e025c2df83b80b3305b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cs \
libreoffice-l10n-cs \
locale-libreoffice-cs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-cs-CZ"

inherit rpm

SUMMARY = "German localization files for LibreOffice"
DESCRIPTION = "Provides German translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-de-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "e81d37fba1794cd9639bee21871c8cf698e76d38e2a225c1b43adcbc6362c699ede4882172c027cbc1d3236e8eb3be68ff0f22ddcc3184e7b0f53d479563e1a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-de \
libreoffice-l10n-de \
locale-libreoffice-de"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-de"

inherit rpm

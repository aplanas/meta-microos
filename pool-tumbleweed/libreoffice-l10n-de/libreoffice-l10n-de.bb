SUMMARY = "German localization files for LibreOffice"
DESCRIPTION = "Provides German translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-de-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "cee4988de7d3fdb19513e2e93b23a80052d7c12d67be9e7a560292dc13d004ca8529c3fe067f06307d5c75d714df46ef02ffac658870e2b77202c672c7b00438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-de \
libreoffice-l10n-de \
locale(libreoffice:de)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-de"

inherit rpm

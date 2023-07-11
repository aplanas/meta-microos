SUMMARY = "Brazilian_Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Brazilian_Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-pt_BR-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "2c6e7d994c7bbafab4f08dc2adaf301005c934cb3292768f7d9eb27eef52ae9533e91678ebff349b4ac8192710619b1f8804ad669d5c2a30fa6bc3795f269f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt-BR \
libreoffice-l10n-pt-BR \
locale-libreoffice-pt-BR"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-BR"

inherit rpm

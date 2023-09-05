SUMMARY = "Brazilian_Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Brazilian_Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-pt_BR-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "6cbfb785a69e77eb241c4850b8f390d6057e3d197198e8197ad0f419bfe73289d94ad6fa2cf21445563805d5052da57fc98ef97f3ebef3920d3bef2ebaff086f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt-BR \
libreoffice-l10n-pt-BR \
locale-libreoffice-pt-BR"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-BR"

inherit rpm

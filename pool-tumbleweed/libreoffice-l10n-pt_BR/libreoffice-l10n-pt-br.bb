SUMMARY = "Brazilian_Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Brazilian_Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-pt_BR-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "54d5dd701ecbeef36e210000143196a66a98aeb108be8a733fdcbf635237624ea3b5f243dfc967c460618673667eec1743bd2422e9a492c8fa9be4a5c3fae790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt-BR \
libreoffice-l10n-pt-BR \
locale-libreoffice-pt-BR"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-BR"

inherit rpm

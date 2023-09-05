SUMMARY = "Zulu localization files for LibreOffice"
DESCRIPTION = "Provides Zulu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-zu-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "ae3ac0fc1ec97a46d0dd3543118f967c40256816eb8f333a6e909f44a1c40d3fac65268844d1cc4bbf7d40aa04dbdd6204ea02352cfc44abb635cd09ff9609c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zu \
libreoffice-l10n-zu \
locale-libreoffice-zu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-zu-ZA"

inherit rpm

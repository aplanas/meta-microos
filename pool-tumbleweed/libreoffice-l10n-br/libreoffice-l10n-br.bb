SUMMARY = "Breton localization files for LibreOffice"
DESCRIPTION = "Provides Breton translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-br-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "677db8677f4254dc44b71dad028e9bd51a0d31f138b36af4cece9b8b592bc2764d992ee6912814a47b2285fbe1bd50fc5509f62007cb97e80837e60d1926f518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-br \
libreoffice-l10n-br \
locale-libreoffice-br"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-br-FR"

inherit rpm

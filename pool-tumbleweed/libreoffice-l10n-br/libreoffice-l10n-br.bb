SUMMARY = "Breton localization files for LibreOffice"
DESCRIPTION = "Provides Breton translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-br-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "68d59a2d7342db1ac693a1b568b9ebb30c9b7e8fafe19941f1c0e40c0aab071980a4116d159df84c226744624472ed3fca2d2dd2aeeab812bcc63b8f2044e923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-br \
libreoffice-l10n-br \
locale-libreoffice-br"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-br-FR"

inherit rpm

SUMMARY = "Icelandic localization files for LibreOffice"
DESCRIPTION = "Provides Icelandic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-is-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "2e712f66b88d4bcb1c4e050a3d4d5ce2a4113ee4c2dc8e1c301cc1885951273f3d696c7326adfb54a009e5f9cc56cea7ce8f2a2e6d14031b1f265712b6874b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-is \
libreoffice-l10n-is \
locale-libreoffice-is"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-is"

inherit rpm

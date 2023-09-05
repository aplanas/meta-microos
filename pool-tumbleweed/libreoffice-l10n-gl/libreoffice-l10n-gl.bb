SUMMARY = "Galician localization files for LibreOffice"
DESCRIPTION = "Provides Galician translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-gl-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "3a5ab2c09000c9d4f50b97b5f649b1d864e44c4d54ced7cef78661328465abedaaecdde7776cee4f9b8d1fc1a01423870f3905d5022976b53d5a1dce69d13e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gl \
libreoffice-l10n-gl \
locale-libreoffice-gl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gl"

inherit rpm

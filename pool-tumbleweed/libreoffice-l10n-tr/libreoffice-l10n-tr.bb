SUMMARY = "Turkish localization files for LibreOffice"
DESCRIPTION = "Provides Turkish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-tr-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "406012852815a29baf171f86437f99da350eac38467c5390528cf92389e2a01dcdf5ce81e89d7466bb00eed684534df4326c51a3a72db0a3b3eb6afd963c20fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tr \
libreoffice-l10n-tr \
locale-libreoffice-tr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-tr-TR"

inherit rpm

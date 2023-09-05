SUMMARY = "Lao localization files for LibreOffice"
DESCRIPTION = "Provides Lao translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-lo-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "c6820237fc9535248050011212ec77843c3c75cc963e0cd02c76713eaab61d22358e27c3943eecd8a2e5a06e8b3ed2bba0c3752fc1af1f61b5c87095554380d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lo \
libreoffice-l10n-lo \
locale-libreoffice-lo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lo-LA"

inherit rpm

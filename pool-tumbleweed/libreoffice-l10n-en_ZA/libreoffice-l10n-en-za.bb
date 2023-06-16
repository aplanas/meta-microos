SUMMARY = "English_ZA localization files for LibreOffice"
DESCRIPTION = "Provides English_ZA translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-en_ZA-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "664f1caa9966d7dade36da8a098b26edb275a4364e6a7ba45512b80d16b5ef9e0d4667aeeef94c57e745d5d93118351c7c6c62b3c95ea62d40f00921c661cf8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-ZA \
libreoffice-l10n-en-ZA \
locale-libreoffice-en-ZA"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-ZA"

inherit rpm

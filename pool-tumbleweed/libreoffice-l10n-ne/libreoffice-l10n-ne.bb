SUMMARY = "Nepali localization files for LibreOffice"
DESCRIPTION = "Provides Nepali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ne-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "6e0182986f67471d0585e392c8ae6fbd988896bff89a707cb4f60a8f96b3499d905f09b4f1116d9cd9fa8fbdc1a56505f22cdcc539519815de14eb1bd8683c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ne \
libreoffice-l10n-ne \
locale(libreoffice:ne)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ne_NP"

inherit rpm

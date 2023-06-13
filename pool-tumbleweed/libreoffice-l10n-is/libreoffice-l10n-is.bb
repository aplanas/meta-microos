SUMMARY = "Icelandic localization files for LibreOffice"
DESCRIPTION = "Provides Icelandic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-is-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "df8f0eb1f5eadfe5b1781568163e81b733737a0247247ad34f4fb6a37f1f745b3ed981fde59c1aa5fc2d5ddeb603edc129fd7660d9b4c37d32d97026e7a2ecf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-is \
libreoffice-l10n-is \
locale(libreoffice:is)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-is"

inherit rpm

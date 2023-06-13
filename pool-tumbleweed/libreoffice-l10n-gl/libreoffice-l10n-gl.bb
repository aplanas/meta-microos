SUMMARY = "Galician localization files for LibreOffice"
DESCRIPTION = "Provides Galician translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-gl-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "0c8d149b14ac847103f83818e0eabae29a40c618f26df69507ddc0d862c912b32d9667e01fa40a98ae4d4a691e90d84f589bf9d77198643dfebebb2e603c95f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gl \
libreoffice-l10n-gl \
locale(libreoffice:gl)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gl"

inherit rpm

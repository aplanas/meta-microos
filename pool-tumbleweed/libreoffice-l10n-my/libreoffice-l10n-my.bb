SUMMARY = "Burnese localization files for LibreOffice"
DESCRIPTION = "Provides Burnese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-my-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "06c3511aa5057432518d025f8d51641f2e6553c4b9023847b278a6ef58029ad7307cdc74f091fc4f517dd1d2105f2d4a320ee7204e09374b1992dc1d08b29ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-my \
libreoffice-l10n-my \
locale-libreoffice-my"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

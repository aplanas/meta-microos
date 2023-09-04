SUMMARY = "Korean localization files for LibreOffice"
DESCRIPTION = "Provides Korean translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ko-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "fd94ba78c55c5fab654d1c7d2b3de84ec802d56999fcda27c60bebfefeceb08200d839f7b8aea2d2f27db23749c00f1636d410c49426dc7840e35a1d0c38da51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ko \
libreoffice-l10n-ko \
locale-libreoffice-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

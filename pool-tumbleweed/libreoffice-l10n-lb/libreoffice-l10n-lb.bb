SUMMARY = "Luxembourgish localization files for LibreOffice"
DESCRIPTION = "Provides Luxembourgish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-lb-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "bbb805e67d96d31b1e1a6edd063a7c9c5a99b8bd655080665a17e31ebf24cb03028f011433ad46665138d63d1ae2f85e3a71dbf1306a98fc1a1805020209005d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lb \
libreoffice-l10n-lb \
locale-libreoffice-lb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

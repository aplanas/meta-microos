SUMMARY = "Farsi localization files for LibreOffice"
DESCRIPTION = "Provides Farsi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-fa-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "7cc788e68fe35a3bf7203a4c36e04f3d41843e127b516d6b6ccbbf1daa5111b9840db7c0971dfff8289398e7447d839f7d855f81adc0c05d60ce237749cfee5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fa \
libreoffice-l10n-fa \
locale-libreoffice-fa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

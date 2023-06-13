SUMMARY = "Uzbek localization files for LibreOffice"
DESCRIPTION = "Provides Uzbek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-uz-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f461dfcf449745adea4c5c26d4a58e0bfa5e3f605280b85cb01418a246e45635ae5fa6a304d52940969c3dad40d37e9e14a601b8c0082dc0742d445368d43e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uz \
libreoffice-l10n-uz \
locale(libreoffice:uz)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

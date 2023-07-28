SUMMARY = "English_ZA localization files for LibreOffice"
DESCRIPTION = "Provides English_ZA translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-en_ZA-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "e30b96d63da8f4c3737bc0dad38799acd2d6afc5d0d21ee3aa49cd84101536b0d3d078e20560ba16c4ec5ee794ededf13e7f7b0d95e1f2f52e39806b6e1e3d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-ZA \
libreoffice-l10n-en-ZA \
locale-libreoffice-en-ZA"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-ZA"

inherit rpm

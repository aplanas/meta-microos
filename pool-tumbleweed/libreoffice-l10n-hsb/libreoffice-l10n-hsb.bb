SUMMARY = "Upper_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Upper_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-hsb-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "ebd8490db3ae7a21176abc9edcd6d68567a7e51b93dd0e8b8bb80f0b6564fc946be455fe0ee8a61b7592f550ca94d7579e322c9f10587ee81e1bd3d3fa09193c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hsb \
libreoffice-l10n-hsb \
locale(libreoffice:hsb)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

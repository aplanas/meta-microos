SUMMARY = "Silesian localization files for LibreOffice"
DESCRIPTION = "Provides Silesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-szl-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "4289e529540f1c6d12580adedeb34c2e59ef50926be479825ed02a5c70cea20d0dad0d30ef841839a7be18a7b3d648506866840e8c1be8d6fcc1d8c437322d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-szl \
libreoffice-l10n-szl \
locale-libreoffice-szl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

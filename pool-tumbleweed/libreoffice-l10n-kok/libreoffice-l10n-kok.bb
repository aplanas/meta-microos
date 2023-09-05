SUMMARY = "Konkani localization files for LibreOffice"
DESCRIPTION = "Provides Konkani translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-kok-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "e10eac88894b5889bf2c403d64a13816eab0645a13827b2f4266e5bc5e61f1f063abe65014b596d04514f3f0216f309e69683b0df156f5a8c952a5e55329990d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kok \
libreoffice-l10n-kok \
locale-libreoffice-kok"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Uyghur localization files for LibreOffice"
DESCRIPTION = "Provides Uyghur translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ug-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "ef04e02d8b44dcbb3b60efde1e4619877a6384fb6bc44e9484551f6185702bc002c650e80c31df4598a43c836f254cc56318a26ef98929f455be626cba528dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ug \
libreoffice-l10n-ug \
locale-libreoffice-ug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

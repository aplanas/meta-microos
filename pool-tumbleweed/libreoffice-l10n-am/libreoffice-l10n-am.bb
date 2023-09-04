SUMMARY = "Amharic localization files for LibreOffice"
DESCRIPTION = "Provides Amharic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-am-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "1bae522bc5bad17ed5225949a0c7f3dfb720208e447ef3f6c8ed71b0073841e70db002eb70be0b7da88e84d640c26b3194a5176010b98710c74fa02613d19ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-am \
libreoffice-l10n-am \
locale-libreoffice-am"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

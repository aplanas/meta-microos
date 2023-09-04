SUMMARY = "Farsi localization files for LibreOffice"
DESCRIPTION = "Provides Farsi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-fa-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "58fafd0e511125805e830a51442902eb13672c86564b41ba1eb60777d8e8b9401f8e9fa02cea4d5848b8c07970eb1271510594ea4799a987e612ea5cd04b6469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fa \
libreoffice-l10n-fa \
locale-libreoffice-fa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

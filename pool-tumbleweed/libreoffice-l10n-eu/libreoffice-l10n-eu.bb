SUMMARY = "Basque localization files for LibreOffice"
DESCRIPTION = "Provides Basque translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-eu-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "1217a44dbca568241ab643e6c334123671102b18eee86ba2d280a60312c9d97c0831d4ece2ab66b8fde0dd144620c00bc211b34304e78cc5526eb2d05c5008af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eu \
libreoffice-l10n-eu \
locale-libreoffice-eu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

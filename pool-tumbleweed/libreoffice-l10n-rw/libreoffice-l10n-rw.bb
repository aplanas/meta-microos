SUMMARY = "Kinyarwanda localization files for LibreOffice"
DESCRIPTION = "Provides Kinyarwanda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-rw-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "a3ba4a0625dcfca8223ab46f98b1d9de45cac4fc9c233d3f48666a9470dc15da1829e9d9e242e744a526d56bb9204892dcbb4fe94f16852ba93927320babaa77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-rw \
libreoffice-l10n-rw \
locale-libreoffice-rw"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

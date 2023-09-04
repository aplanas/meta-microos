SUMMARY = "Dzongkha localization files for LibreOffice"
DESCRIPTION = "Provides Dzongkha translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-dz-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "30fca950be04c45508ff1d380de76dcb991168d59a050af1b7fd18f885d580ee7eb689b9e1f8e5c393bcb0c00763b09cfa472bc2e2d8b54e31b14e4249d712f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dz \
libreoffice-l10n-dz \
locale-libreoffice-dz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Tsonga localization files for LibreOffice"
DESCRIPTION = "Provides Tsonga translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ts-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "351204b5e09513a845c1d8a271436b6b138227b914fc93fd78be44ff7e7067971f12debb1e6bd6eaaa1043fd35d33f7639894282dc87a7e4b09f11ceefc9b85c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ts \
libreoffice-l10n-ts \
locale-libreoffice-ts"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

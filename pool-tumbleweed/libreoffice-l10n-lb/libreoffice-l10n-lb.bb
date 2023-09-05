SUMMARY = "Luxembourgish localization files for LibreOffice"
DESCRIPTION = "Provides Luxembourgish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-lb-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "8a941b7d45a5db20aaaf6e35703a0175ed55b23646179192a7eb65d9fb8eaa16b530b94053ca84304ed7b952c9b09ec514c22a879a4cc4af152437caaa853d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lb \
libreoffice-l10n-lb \
locale-libreoffice-lb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

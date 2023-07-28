SUMMARY = "Dzongkha localization files for LibreOffice"
DESCRIPTION = "Provides Dzongkha translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-dz-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "70f3ac00049003e9d57744bd3ac6d85fde7027e803dddb3f20be6948c318710f659d329b97ac379955d239ab83f9f9ea0ae993b0bcf4a02487b74bfe686c0e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dz \
libreoffice-l10n-dz \
locale-libreoffice-dz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

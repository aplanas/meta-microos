SUMMARY = "Monglolian localization files for LibreOffice"
DESCRIPTION = "Provides Monglolian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mn-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "435cd74802edc2add2175033b93ad7cb89518ef0d2b396c9232eda93239a8d2508d34df7168e298a858ad9f5207263a5f6551da8af007580a097499c9cf98122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mn \
libreoffice-l10n-mn \
locale-libreoffice-mn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

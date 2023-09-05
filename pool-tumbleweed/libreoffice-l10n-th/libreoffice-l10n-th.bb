SUMMARY = "Thai localization files for LibreOffice"
DESCRIPTION = "Provides Thai translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-th-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "7e86c4ed927d84bdb3ea23fac340a47ddf6f22ea791469e6bfd1465f5af673a6bdf37b8228805033ed59c5f1ffd499bb2f6c8bf1a694dbfc20147ec56a850be8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-th \
libreoffice-l10n-th \
locale-libreoffice-th"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-th-TH"

inherit rpm

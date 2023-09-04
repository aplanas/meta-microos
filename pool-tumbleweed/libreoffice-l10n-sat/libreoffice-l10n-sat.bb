SUMMARY = "Santali localization files for LibreOffice"
DESCRIPTION = "Provides Santali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sat-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ffc82a5d62541f2edf2677a0f838aa918238e23ebfe84832cd54c346b4700d4a457691de2ba3da94a83c66068153ec6342a6bd0cb0df1086b1d1c85302100317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sat \
libreoffice-l10n-sat \
locale-libreoffice-sat"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

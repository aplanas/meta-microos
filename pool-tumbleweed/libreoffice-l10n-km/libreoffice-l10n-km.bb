SUMMARY = "Khmer localization files for LibreOffice"
DESCRIPTION = "Provides Khmer translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-km-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "7b3ea39af19fce6c7f6716b916aff3fa640c6dc2a8a498eb5846b552184f10eac605a540a4b0ed96d7dcca8ee583396ee104ed3b241e48c39db1ff7e5c384c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-km \
libreoffice-l10n-km \
locale(libreoffice:km)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

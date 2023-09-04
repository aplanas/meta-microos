SUMMARY = "Serbian localization files for LibreOffice"
DESCRIPTION = "Provides Serbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sr-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "e3bfeca44209c23432ba0c5d792afe5c2c28b7565c0f8733f46ed90df5d364412d30c105611da9345da030768562e90106960fb6e3eaf3badc946e4720b3c7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sr \
libreoffice-l10n-sr \
locale-libreoffice-sr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sr"

inherit rpm

SUMMARY = "Belarusian localization files for LibreOffice"
DESCRIPTION = "Provides Belarusian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-be-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "0befee210f373b5c41ec721434d21742d2a5668b32cd8862cf282d43681148c5f578940f094776fa58f82ca50d88c001d0185bd6b04b6997e80a60d77a23e24e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-be \
libreoffice-l10n-be \
locale-libreoffice-be"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-be-BY"

inherit rpm

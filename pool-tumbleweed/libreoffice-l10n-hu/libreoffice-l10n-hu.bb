SUMMARY = "Hungarian localization files for LibreOffice"
DESCRIPTION = "Provides Hungarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-hu-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "953d0c496b3e96b1b902b58f240e7748c8346c71cc7fb32009b2aba62c59fc6c8902cad3be1f6469a10fd29e3f7b44ebf2bd0512eed5b5537246eb4aef577681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hu \
libreoffice-l10n-hu \
locale-libreoffice-hu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hu-HU"

inherit rpm

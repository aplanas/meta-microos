SUMMARY = "English_GB localization files for LibreOffice"
DESCRIPTION = "Provides English_GB translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-en_GB-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "fe21c666e33dcaa48e5a240beadb79e6010a91e5b39eaaf3f9b938bc8c11a6a3531bae34e07755d06ecc87d8d7a717f812ac9dcc11989442df3242fb2d8eecd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-GB \
libreoffice-l10n-en-GB \
locale-libreoffice-en-GB"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-GB"

inherit rpm

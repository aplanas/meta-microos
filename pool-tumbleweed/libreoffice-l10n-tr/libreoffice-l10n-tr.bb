SUMMARY = "Turkish localization files for LibreOffice"
DESCRIPTION = "Provides Turkish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-tr-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "71edbf3820fc3293916a6bc231bde622e3298c4af6181168bf99844b28b0bf01b79f9eb6fbc8c34334c16a5166d79a91a88d819fb31a01f9914045bb12abe7d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tr \
libreoffice-l10n-tr \
locale-libreoffice-tr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-tr-TR"

inherit rpm

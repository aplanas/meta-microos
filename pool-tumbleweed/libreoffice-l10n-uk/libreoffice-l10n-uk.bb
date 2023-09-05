SUMMARY = "Ukrainian localization files for LibreOffice"
DESCRIPTION = "Provides Ukrainian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-uk-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "7442eb5dc8d5b38c53ba54463af84e5293f2d44134d88e5182f7b4f86c94d57991132272eb911f32ee0c56df0707746f49dcf36830ca4403e7483efea45955ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uk \
libreoffice-l10n-uk \
locale-libreoffice-uk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-uk-UA"

inherit rpm

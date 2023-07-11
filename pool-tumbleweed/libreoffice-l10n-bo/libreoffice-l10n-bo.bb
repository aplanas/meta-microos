SUMMARY = "Tibetian localization files for LibreOffice"
DESCRIPTION = "Provides Tibetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bo-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "9335a33b82a078b6bfb1fffdc621f908f8d90616381511233f5fe58a8649ae991bb37fec03e064afd208877d0ba28db7ab6e7f634634a92476f736cc7a90c56c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bo \
libreoffice-l10n-bo \
locale-libreoffice-bo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bo"

inherit rpm

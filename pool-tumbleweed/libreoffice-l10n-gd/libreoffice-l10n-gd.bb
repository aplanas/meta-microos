SUMMARY = "Gaelic localization files for LibreOffice"
DESCRIPTION = "Provides Gaelic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-gd-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "460ffb0ae282a78ff341b8cc33b2f784ff6ebf43fcc93a40c7ef6f48eb4c1d1f340ddaea616bea17a1344f2911bece5a7cc5fa1c553bbb76a9a7cd20460993f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gd \
libreoffice-l10n-gd \
locale-libreoffice-gd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gd-GB"

inherit rpm

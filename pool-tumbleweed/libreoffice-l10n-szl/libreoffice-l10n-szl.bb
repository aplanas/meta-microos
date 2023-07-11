SUMMARY = "Silesian localization files for LibreOffice"
DESCRIPTION = "Provides Silesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-szl-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "acede307b48dc6809543032b98f8efbe2136206bfcb65932edea710c59a30dbd69e6c5cd748f6ce6b5fd42115ea0ba21d44e5ed3cc546a9f146aaee94016c465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-szl \
libreoffice-l10n-szl \
locale-libreoffice-szl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

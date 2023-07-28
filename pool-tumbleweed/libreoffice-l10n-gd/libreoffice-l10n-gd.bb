SUMMARY = "Gaelic localization files for LibreOffice"
DESCRIPTION = "Provides Gaelic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-gd-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "4c375990d2ffa31a79bdaf1ee66e907a74ec5d7327c8c485a942c96cb08e2607c1b3336ceabbda2e4f7818354cb6655ef777f49aad668a2b7380e2edec3f40e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gd \
libreoffice-l10n-gd \
locale-libreoffice-gd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gd-GB"

inherit rpm

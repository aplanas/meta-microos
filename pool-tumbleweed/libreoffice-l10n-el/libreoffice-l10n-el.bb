SUMMARY = "Greek localization files for LibreOffice"
DESCRIPTION = "Provides Greek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-el-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "f6575bac54ca2d25ec340bc7eb2a3deb87d44ad2ff01d44982d5e557cebdd19ee1f0318823ece69edf705c56a7733a76cbfba776bc4f39e973f988e4bd91bb40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-el \
libreoffice-l10n-el \
locale-libreoffice-el"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-el-GR"

inherit rpm

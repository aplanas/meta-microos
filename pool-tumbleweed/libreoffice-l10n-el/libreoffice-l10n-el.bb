SUMMARY = "Greek localization files for LibreOffice"
DESCRIPTION = "Provides Greek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-el-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a00c08639028bb2e8442f53b7b653b7d43846ca454db4509172ae81d19fe9d80f843cacd70ead950978874787cc016dc35bfda1bd7a463d808d74f532f9c3dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-el \
libreoffice-l10n-el \
locale-libreoffice-el"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-el-GR"

inherit rpm

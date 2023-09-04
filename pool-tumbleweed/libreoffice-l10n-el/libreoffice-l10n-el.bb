SUMMARY = "Greek localization files for LibreOffice"
DESCRIPTION = "Provides Greek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-el-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "45208a9d47243090e52dbb3d57aca0d2830d321f63878de2aa642a831eb09efad17def61a9c3a39e700218900674a31b1b5f182b29293715d80a814e4bbc189b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-el \
libreoffice-l10n-el \
locale-libreoffice-el"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-el-GR"

inherit rpm

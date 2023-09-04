SUMMARY = "Russian localization files for LibreOffice"
DESCRIPTION = "Provides Russian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ru-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "115df94680a2daa206d705408935e8f2fde18ffa90b30a4b538fe5f9425c2006144bc2bdfbf73479b200a74969e11921d40567fd5385e67f0e044190dce29c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ru \
libreoffice-l10n-ru \
locale-libreoffice-ru"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ru-RU"

inherit rpm

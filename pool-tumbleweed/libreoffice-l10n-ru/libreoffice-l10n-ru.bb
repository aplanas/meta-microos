SUMMARY = "Russian localization files for LibreOffice"
DESCRIPTION = "Provides Russian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ru-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "6f47825617a9da45ebcb39b1ac409208e06a74ee8496befa5e21d6473443c085e369776f511b2f4be8d46ecf397232deb710859d2c7a1845bd6135f4aaff99df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ru \
libreoffice-l10n-ru \
locale-libreoffice-ru"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ru-RU"

inherit rpm

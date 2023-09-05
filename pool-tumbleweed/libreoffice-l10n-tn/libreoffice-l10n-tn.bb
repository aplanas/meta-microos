SUMMARY = "Tswana localization files for LibreOffice"
DESCRIPTION = "Provides Tswana translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-tn-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a8cf4e331143a9385c4e877a352cd408bccfa773658723ef8f6c0db347d7784e198863e5ef1e6246661ae02e285b70aeea1bfe496ef68c4cbc748503983cac05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tn \
libreoffice-l10n-tn \
locale-libreoffice-tn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

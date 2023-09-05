SUMMARY = "Korean localization files for LibreOffice"
DESCRIPTION = "Provides Korean translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ko-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "aa845e91ddbb20854f8aa6616a19c17d122f48d721ee2b2514e37bd546ff4bbcf4bbb132dd661356c6a4b0496c680fe7e9cc62f34589b6a88b26f7a2fd1b9e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ko \
libreoffice-l10n-ko \
locale-libreoffice-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

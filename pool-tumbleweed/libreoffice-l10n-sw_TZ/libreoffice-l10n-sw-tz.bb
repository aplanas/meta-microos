SUMMARY = "Swahili localization files for LibreOffice"
DESCRIPTION = "Provides Swahili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sw_TZ-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "9a208b9ac20392cc1ade26bbf1521c4c0bc5dbbac2aa711052d74a6b62accc858e0ec3c5744540aa231830b7449a0abb41997c64f5617d6ac8cf593c00e296a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sw-TZ \
libreoffice-l10n-sw-TZ \
locale-libreoffice-sw-TZ"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sw-TZ"

inherit rpm

SUMMARY = "Swahili localization files for LibreOffice"
DESCRIPTION = "Provides Swahili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-sw_TZ-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "5a7682b2f269f20e3e88d1fed0642aba604db96929d0cc35a0fe54b697e5b5c8bc2874c5487be5d68fd2467537d3e2e35bfc64573d206654d7dcfc6f075c74e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sw-TZ \
libreoffice-l10n-sw-TZ \
locale-libreoffice-sw-TZ"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sw-TZ"

inherit rpm

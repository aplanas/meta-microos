SUMMARY = "Vietnamese localization files for LibreOffice"
DESCRIPTION = "Provides Vietnamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-vi-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "9608b921b430bd6bb60b3573133a2c989db07bcb0a2a736730e9e25b8385ae0216f9d3897a4e40e10547c4ce6133ac65cf25ae86ea1c87b9879031de98ca486d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vi \
libreoffice-l10n-vi \
locale-libreoffice-vi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-vi"

inherit rpm

SUMMARY = "Welsh localization files for LibreOffice"
DESCRIPTION = "Provides Welsh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-cy-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "f05d1efb09a2c938683b5eda02cbb6ecbc4ec8eb882f21777c1815e8d09fed59bca49b506abdd1eeca3951a479ec63a3c247a7f0e8fc3fbbc7dc8b97b415516e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cy \
libreoffice-l10n-cy \
locale-libreoffice-cy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Vietnamese localization files for LibreOffice"
DESCRIPTION = "Provides Vietnamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-vi-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "46a4951672d6df8940b0350ffaa33f97baea2173604695352ea61c82051750f88dcced0cb7f2325f1351303d6b5068a3b060dd137db3aca3018bfe6b8048abdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vi \
libreoffice-l10n-vi \
locale-libreoffice-vi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-vi"

inherit rpm

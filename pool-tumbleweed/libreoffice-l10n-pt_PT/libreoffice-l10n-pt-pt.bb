SUMMARY = "Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-pt_PT-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "4bd3f4b1c1479b0e70f03c871c6a21375a700249fea6469dcd03e25c141dd9908c322b1bed8c5a5623185b6419ce05cc5fdd9dbbe96f2a218a5dcaa456b4444d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt \
libreoffice-help-pt-PT \
libreoffice-l10n-pt \
libreoffice-l10n-pt-PT \
locale-libreoffice-pt-PT"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-PT"

inherit rpm

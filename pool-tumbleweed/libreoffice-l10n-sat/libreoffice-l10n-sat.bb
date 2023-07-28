SUMMARY = "Santali localization files for LibreOffice"
DESCRIPTION = "Provides Santali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sat-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "217752416a82e25e90fa73751995970d555f312eb47447fdc49fa7ecfb2f722ef4a1e365f29d37ecce649f51704f00af4e662cf801e30342d610d741494368ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sat \
libreoffice-l10n-sat \
locale-libreoffice-sat"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

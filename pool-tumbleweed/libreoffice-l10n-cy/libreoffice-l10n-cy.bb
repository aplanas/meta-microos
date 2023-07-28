SUMMARY = "Welsh localization files for LibreOffice"
DESCRIPTION = "Provides Welsh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-cy-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "d29d5a86b6f92d76f6c410bde85d4a651e857d00c651e022f40074364e551bb23adcda7e0f21f637cd09acbd8ec3873bbd0d5140390d108087223b9f91cc210d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cy \
libreoffice-l10n-cy \
locale-libreoffice-cy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

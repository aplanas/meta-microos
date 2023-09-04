SUMMARY = "Galician localization files for LibreOffice"
DESCRIPTION = "Provides Galician translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-gl-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "1e29151c8d38ebf5a33fb14352aebb9c4ca71219976c4ec4878a863d9b0acdd600b37c28fcf0ffcc7e259a864b94347c121a5a97b30b217080a3b5cdc016fb03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gl \
libreoffice-l10n-gl \
locale-libreoffice-gl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gl"

inherit rpm

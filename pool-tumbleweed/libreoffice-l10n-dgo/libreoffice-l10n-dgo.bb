SUMMARY = "Dogri localization files for LibreOffice"
DESCRIPTION = "Provides Dogri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-dgo-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "9118756f861975b2b8661b1054e109d10eba3315c6450f770abc019381305bdef99135d3d0e63fc658af3affd1a90d4fcb8b112c78e5c5cd6b3ee5ab3281b94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dgo \
libreoffice-l10n-dgo \
locale-libreoffice-dgo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

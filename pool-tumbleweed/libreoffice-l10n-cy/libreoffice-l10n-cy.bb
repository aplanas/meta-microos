SUMMARY = "Welsh localization files for LibreOffice"
DESCRIPTION = "Provides Welsh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-cy-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "62a0c22b691cd8e6c7fb5d773c56fb55559a35ae696e34879bcaa37c8be80acf00f4bb5064e87c52a438e2d9bde1eb5b3ac174ab98f4532d20f377ab8ffb1591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cy \
libreoffice-l10n-cy \
locale-libreoffice-cy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

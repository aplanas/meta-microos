SUMMARY = "Irish localization files for LibreOffice"
DESCRIPTION = "Provides Irish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ga-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "358df0c17c039b3d11a3bc56ff23e08f7793822c76bc097ad19a8f3a2dbe32bef2226147c2c8fcb91e8a1cb5fd19b2afa08688cdd2a7e07f53cede95e7e3b7f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ga \
libreoffice-l10n-ga \
locale-libreoffice-ga"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

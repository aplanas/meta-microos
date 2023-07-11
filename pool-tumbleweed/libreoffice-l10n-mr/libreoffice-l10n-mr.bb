SUMMARY = "Marathi localization files for LibreOffice"
DESCRIPTION = "Provides Marathi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mr-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "dea5039d8db2025d1cb10ee26d5cd879ac5864291bb2732bb81d99977a27dbc5537d830edcb0df5f6002f09e35f1ae89efed85b968c93a12677854909d8dd023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mr \
libreoffice-l10n-mr \
locale-libreoffice-mr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

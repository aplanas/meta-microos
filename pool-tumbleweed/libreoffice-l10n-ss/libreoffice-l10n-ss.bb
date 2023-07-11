SUMMARY = "Swati localization files for LibreOffice"
DESCRIPTION = "Provides Swati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ss-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "8da2d0b72c84ac03b07fae6e9a9f070e49a4eb5c5cf4154c54a3b4a7cbd54e04a64048b9cd5cbd6511d7d568969b61b70fb6995b1b4ea56bd38cbf7bcf6fe1c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ss \
libreoffice-l10n-ss \
locale-libreoffice-ss"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

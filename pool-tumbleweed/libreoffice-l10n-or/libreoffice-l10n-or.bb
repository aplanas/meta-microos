SUMMARY = "Odia localization files for LibreOffice"
DESCRIPTION = "Provides Odia translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-or-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "d7c37f627ce9187293c9dd2c315e08f53ce844d3e34e776bd2dc2bb1f09f6f9f79afa66d29d3d6f8691173534ba8f90cc3172bba2e34e6671eeff20247dc0b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-or \
libreoffice-l10n-or \
locale-libreoffice-or"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

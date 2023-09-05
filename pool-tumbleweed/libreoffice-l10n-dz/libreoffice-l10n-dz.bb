SUMMARY = "Dzongkha localization files for LibreOffice"
DESCRIPTION = "Provides Dzongkha translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-dz-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "da23a54f62df8eaafd9f80f2c17a5d4b4963b7a9a78285d860a0825db5523381887b6dc2ab3371e6517b6d254596e238b2b8b0f0bdcb1ca136ab17461983d71b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dz \
libreoffice-l10n-dz \
locale-libreoffice-dz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

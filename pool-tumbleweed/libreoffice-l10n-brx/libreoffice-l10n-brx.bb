SUMMARY = "Bodo localization files for LibreOffice"
DESCRIPTION = "Provides Bodo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-brx-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "8db2c2d75fa24c3433e8739b3432a2edd20bf00d4ce77ce4ab4a92ac1cb1b1849aa9aeb3b27d77b5bd90d793de3ce5bfbf90d3d375b2e36ab4af171f87ff58b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-brx \
libreoffice-l10n-brx \
locale-libreoffice-brx"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Venetian localization files for LibreOffice"
DESCRIPTION = "Provides Venetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-vec-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "32c66be20a2eb39ae24c07e93086f5c3d4b38aad589b7e75a245493bd90311795a4a0a166c9663043676c2abb60cf1e2cae87efc451695f58725b28b7950d962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vec \
libreoffice-l10n-vec \
locale-libreoffice-vec"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Kinyarwanda localization files for LibreOffice"
DESCRIPTION = "Provides Kinyarwanda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-rw-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "3dcd82db179993f2e21d5775fe0929132e29e9cb00ec09aca700b9866791c0201273889efa5f5867d768b10a49ebec7f88a6e6ac3851df003cca4052ed403244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-rw \
libreoffice-l10n-rw \
locale-libreoffice-rw"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

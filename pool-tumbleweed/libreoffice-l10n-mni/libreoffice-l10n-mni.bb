SUMMARY = "Manipuri localization files for LibreOffice"
DESCRIPTION = "Provides Manipuri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-mni-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "179500b82c804a062ae0ede6baa345f73c060cabc9b6e7d188ddb8ef9722391f67ac3a2862bc173b2696153fa841c0f2c36e16c508df93ae71a27f5fcd46f098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mni \
libreoffice-l10n-mni \
locale(libreoffice:mni)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

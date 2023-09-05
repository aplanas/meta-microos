SUMMARY = "Marathi localization files for LibreOffice"
DESCRIPTION = "Provides Marathi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-mr-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "5199ad70bfc7c97064f4b260e0d4871942a44c50686bfc7d9f827e4945cea3181c246cedbf28f40cfd34b70b7a4eb0351f0263749f4ccf2a83a2085136075d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mr \
libreoffice-l10n-mr \
locale-libreoffice-mr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

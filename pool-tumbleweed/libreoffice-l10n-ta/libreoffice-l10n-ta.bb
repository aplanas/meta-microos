SUMMARY = "Tamil localization files for LibreOffice"
DESCRIPTION = "Provides Tamil translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ta-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "77c97b193deb83a3e5721809e9d010f599881f65f9e3e31fabcc023c0d9c239a042e84e03b3d0b3d3945d14dac13507cad79e4e88b8b436f792cb6b9bf377747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ta \
libreoffice-l10n-ta \
locale-libreoffice-ta"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

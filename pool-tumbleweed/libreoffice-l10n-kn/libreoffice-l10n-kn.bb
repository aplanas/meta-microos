SUMMARY = "Kannada localization files for LibreOffice"
DESCRIPTION = "Provides Kannada translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kn-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "5fbfe4f0260613bf80b570050c03ea1858e404d4b78b2de9b2d88a56f52df1bd2abc656767dcbf98855438a8ede7d5c73ada18930967150809acfe2024f7cc9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kn \
libreoffice-l10n-kn \
locale-libreoffice-kn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

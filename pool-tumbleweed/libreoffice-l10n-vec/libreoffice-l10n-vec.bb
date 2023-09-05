SUMMARY = "Venetian localization files for LibreOffice"
DESCRIPTION = "Provides Venetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-vec-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "4b7f6bea03a8470bd09a63e0b0808266c63d4c810c37f6ccd497f26e1435b210b3d8db0f08494c086af1b3e9de55436335a05d74e1dfa7b0bd96c28ee1fc4c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vec \
libreoffice-l10n-vec \
locale-libreoffice-vec"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Kabyle localization files for LibreOffice"
DESCRIPTION = "Provides Kabyle translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-kab-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "42e0f4d9063864f5fc9e453b2f17214c0ca68a60fadd0bf70756edffba8125d92d576591c21b7ebe4fe5c5e52babb1e07ed9cf10c8dc3442c4cfead34dae2c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kab \
libreoffice-l10n-kab \
locale-libreoffice-kab"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

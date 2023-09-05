SUMMARY = "Basque localization files for LibreOffice"
DESCRIPTION = "Provides Basque translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-eu-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "0dcae9c72af25065def08046a16fcc4d6d4f01982c5b2862ce1dc424d5e3f13f48f6bc0eed2f5cd73e205cd7e7634d40381f0cea4cf099bfdbcec66fab6b1ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eu \
libreoffice-l10n-eu \
locale-libreoffice-eu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

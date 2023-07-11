SUMMARY = "Venetian localization files for LibreOffice"
DESCRIPTION = "Provides Venetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-vec-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "424b3ad2d0ed9e4904e0b46d5338caa0c41cda21bcca08bd8b7c812dd20e28752f63c7deface7284cbd60f26359dff9c13f4e77204fd83882322f5640cbfe656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vec \
libreoffice-l10n-vec \
locale-libreoffice-vec"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

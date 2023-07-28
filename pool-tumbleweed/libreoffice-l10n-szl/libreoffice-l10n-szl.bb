SUMMARY = "Silesian localization files for LibreOffice"
DESCRIPTION = "Provides Silesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-szl-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "3c9f8f5117a2df51914005efeffc11c1d5cf434685c6cc38bafdbf21e730a18812399e4d6efd951e8b026e214254f66016a7f349461be345c14e9dbd23d2de9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-szl \
libreoffice-l10n-szl \
locale-libreoffice-szl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Silesian localization files for LibreOffice"
DESCRIPTION = "Provides Silesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-szl-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "a62d0c6ebd1a19e81da760e90933eca81907d1542b0706123b5dec26cf64c17d974a9361bc57a08e277aad92547a049b238d3f5b2962c3da73afe1f4f3444b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-szl \
libreoffice-l10n-szl \
locale-libreoffice-szl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Oromo localization files for LibreOffice"
DESCRIPTION = "Provides Oromo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-om-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "8c55d3b265c3e29d86aacd2a6770dbf9f43c361b6e07be9a90c58094f336b13340723f06c7a6e29e46dab75ad13ad8a792049a89a4cad5e5458a82522760358d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-om \
libreoffice-l10n-om \
locale-libreoffice-om"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

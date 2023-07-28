SUMMARY = "Northern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Northern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nso-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "d1388b30c2b06cfcae40ec02de87d7859cdcc95b10b8e3a2ba4daf06c2df96502f9c1e8d083d819d2d103ded7cd22e741e3a93953bad2d6cd30c8e007fa602ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nso \
libreoffice-l10n-nso \
locale-libreoffice-nso"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Tajik localization files for LibreOffice"
DESCRIPTION = "Provides Tajik translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-tg-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "7f9428657b89ca1622d613f412f270b0233e2c309fcfca1710e66ab9f94413523a0dce5a12aca64f9d4925851d961921f62f8696de77734c58e3988cec4fbd0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tg \
libreoffice-l10n-tg \
locale-libreoffice-tg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

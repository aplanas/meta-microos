SUMMARY = "Santali localization files for LibreOffice"
DESCRIPTION = "Provides Santali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-sat-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "2e1a7b8bbdd734fe6f2e9ec79b6939f41836b9f6ed75ee819eac8f4866522e12576366b95dbfccd4b300a65466d168325a40950e21a025dd71a3d274c7743ef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sat \
libreoffice-l10n-sat \
locale-libreoffice-sat"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

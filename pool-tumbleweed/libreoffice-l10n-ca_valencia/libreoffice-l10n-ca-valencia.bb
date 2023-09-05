SUMMARY = "Valencian localization files for LibreOffice"
DESCRIPTION = "Provides Valencian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ca_valencia-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "8f894cc4e05635618f8aa424b318f74f504be6d4ac9c97f9af025a0291e0fc00953e5e539519015d6e52476e9412138f117416f8f9a51d4ab926738205157a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca-valencia \
libreoffice-l10n-ca-valencia \
locale-libreoffice-ca-valencia"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca-ES-valencia"

inherit rpm

SUMMARY = "Finnish localization files for LibreOffice"
DESCRIPTION = "Provides Finnish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fi-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "607c77025e0e065c6c695d6a3197e5d2b7e601fb56e3a12c46332222447cc5ae1da0dcdf19d6fe8ed5ed06ca921fa9101e6081fbc9279272ef32136b7b2b348c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fi \
libreoffice-l10n-fi \
locale-libreoffice-fi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
libreoffice-voikko"

inherit rpm

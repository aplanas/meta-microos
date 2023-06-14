SUMMARY = "Southern_Ndebele localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Ndebele translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-nr-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "0587a62aa788d5a8e09a43327e4385572d95720a7db468eb1329f5775c6e8e4e0fe6525b26d15dafc986e5e392ac07b6edc235a31a68ddbab0e932f718673426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nr \
libreoffice-l10n-nr \
locale-libreoffice-nr"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

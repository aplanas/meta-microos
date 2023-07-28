SUMMARY = "Valencian localization files for LibreOffice"
DESCRIPTION = "Provides Valencian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ca_valencia-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "f37f19c6dfa1986b66766277d3118f6d8b38d7c7ba585d2c201c54df1c972370603bda7ddfce678aeb3ddeae34cf2f377f56fc43e7efccda5e519fa5b69ed328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca-valencia \
libreoffice-l10n-ca-valencia \
locale-libreoffice-ca-valencia"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca-ES-valencia"

inherit rpm

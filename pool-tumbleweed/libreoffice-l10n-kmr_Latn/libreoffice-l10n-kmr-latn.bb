SUMMARY = "Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-kmr_Latn-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "1bd5ef4000a072877a3d04023bbb0b4542c253ddf136cd4c568c8e7424f7e8e981dbbeabe1713021355f7717d5e3a01d3c25f227911e4e9263bab4c63fed1785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kmr-Latn \
libreoffice-l10n-kmr-Latn \
locale-libreoffice-kmr-Latn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-kmr-Latn"

inherit rpm

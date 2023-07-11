SUMMARY = "Galician localization files for LibreOffice"
DESCRIPTION = "Provides Galician translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-gl-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "4dc987305cb4e261fec130a57a90ab3cd2d409df3f75d319ab47212274bd28aed7460bca1dee3144f6c61b4505d89a5c8fad1e995af6b621b9f3ef28431aefc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gl \
libreoffice-l10n-gl \
locale-libreoffice-gl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gl"

inherit rpm

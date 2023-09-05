SUMMARY = "English localization files for LibreOffice"
DESCRIPTION = "Provides English translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-en-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "d59338e7b3d1e4ceac4bcf20cb22657b7865106ec9f3ff6b748b5fd63acbdd4336847a2887b5ee75da8c137317f4bdc0b19502d75ac64c8fb6f820944cd6f058"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en \
libreoffice-help-en-US \
libreoffice-l10n-en \
locale-libreoffice-en"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en"

inherit rpm

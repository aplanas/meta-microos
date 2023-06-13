SUMMARY = "Telugu localization files for LibreOffice"
DESCRIPTION = "Provides Telugu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-te-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "e56395cf13e5dd9f46119b3b9b359ff4ef3ab63c4fbb83020b22276014384bde29745fa313026844b849f115dfd6fdd4a1a64bde02af78d2b0884b916c23ab3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-te \
libreoffice-l10n-te \
locale(libreoffice:te)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-te_IN"

inherit rpm

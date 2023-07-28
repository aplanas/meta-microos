SUMMARY = "Swedish localization files for LibreOffice"
DESCRIPTION = "Provides Swedish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sv-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "9a952020f95dd6133616f77f91e7ad3dabb140c782ee5e9477530bc9f90e2b959877c797a8c603201c2fb8e66c4c587cac4d6ac9dbb6ca305e338c3447940c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sv \
libreoffice-l10n-sv \
locale-libreoffice-sv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sv-SE"

inherit rpm

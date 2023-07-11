SUMMARY = "Hungarian localization files for LibreOffice"
DESCRIPTION = "Provides Hungarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-hu-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "0ec184f5df307e2058c3e0d5df07e322e97b9b8d374cfb2eb7745bfc48295db37be039db3d873dc1b02da0b821b34f9a39fc5bdaeabcf8ca71ec5c5890e8837b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hu \
libreoffice-l10n-hu \
locale-libreoffice-hu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hu-HU"

inherit rpm

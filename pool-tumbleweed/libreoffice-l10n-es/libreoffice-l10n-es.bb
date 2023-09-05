SUMMARY = "Spanish localization files for LibreOffice"
DESCRIPTION = "Provides Spanish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-es-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "f2102808021a7dd981a96facc280b881ac61cbc8b63a9ab30f175eb9da03431dfa52c0a70d5de0b6210622e98180fe9bf16aa439903d0a59a9ea5939c32c8884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-es \
libreoffice-l10n-es \
locale-libreoffice-es"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-es"

inherit rpm

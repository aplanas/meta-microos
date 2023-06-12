SUMMARY = "Breton localization files for LibreOffice"
DESCRIPTION = "Provides Breton translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-br-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f52889feb599450c1be3511e1fa5a40a80e6f407df3d11cc41e4494e13df9712c2fc046a6325a8811af5c9c1b0a2170faff5168be79afafa140888154590025d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-br \
libreoffice-l10n-br \
locale(libreoffice:br)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-br_FR"

inherit rpm

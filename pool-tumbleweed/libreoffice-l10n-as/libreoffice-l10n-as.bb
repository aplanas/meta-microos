SUMMARY = "Assamese localization files for LibreOffice"
DESCRIPTION = "Provides Assamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-as-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "249a5cfa2ff3a4a6d0fba3029961d1702280647b8585900fcf808ea15d877c6441626e981e814bc3ad07f5e56f3175bd78d4810d274c09308894fc59b4e58c61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-as \
libreoffice-l10n-as \
locale-libreoffice-as"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

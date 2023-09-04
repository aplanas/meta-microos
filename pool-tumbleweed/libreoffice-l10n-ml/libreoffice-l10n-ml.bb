SUMMARY = "Malayalam localization files for LibreOffice"
DESCRIPTION = "Provides Malayalam translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ml-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "7d21038ffd2f44118d05f6fbed560dcab5a859e32a743ab1ffeb6ac8150e1b7036bfdd99be80ec42e858921669e801ffe82f13adaa20970c50dfa1bd7b7f271a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ml \
libreoffice-l10n-ml \
locale-libreoffice-ml"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

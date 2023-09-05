SUMMARY = "Danish localization files for LibreOffice"
DESCRIPTION = "Provides Danish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-da-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "665ebba4c829c4c42aae55281e0fa51685bfec773bfba28ff8c22d8bee8965660b4ab28af568c34fd8ba88add658eb91c34b0392cd4fdcff6732bd821961d1a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-da \
libreoffice-l10n-da \
locale-libreoffice-da"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-da-DK"

inherit rpm

SUMMARY = "Bengali localization files for LibreOffice"
DESCRIPTION = "Provides Bengali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bn-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "5ef48e1ad2302d827d54981f894f5f39bd6faf04f572e4e18c89c20e42cee1eaa20968d187ebbc1b7d6524a0a34c02bf6f31f5297e5f80269dc7eb8950944cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn \
libreoffice-l10n-bn \
locale-libreoffice-bn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-BD"

inherit rpm

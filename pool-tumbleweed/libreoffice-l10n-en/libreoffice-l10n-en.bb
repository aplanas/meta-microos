SUMMARY = "English localization files for LibreOffice"
DESCRIPTION = "Provides English translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-en-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "43028bf394c24b5d59018ea1a5b3ea6ca5d065d4d2f76b69fe1678ab3a6391103fd491f493b277ec59ce3ff0e0cdd0db58c019afc8ec01cd4c5f9ff382e67809"
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

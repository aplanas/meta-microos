SUMMARY = "Malayalam localization files for LibreOffice"
DESCRIPTION = "Provides Malayalam translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ml-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "53aeca45a3177128ffad8e722665bbc99b6f9cb815c1c114ebaf9e902893a90d9b8f0ccecd0dacc249f2efcb79083011ad1ed0e904677027dce0aec736fd76a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ml \
libreoffice-l10n-ml \
locale-libreoffice-ml"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

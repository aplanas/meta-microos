SUMMARY = "French localization files for LibreOffice"
DESCRIPTION = "Provides French translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-fr-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "810d0c53909428331153c7a952c75587f2d2c4a37ac73ea001279a88000de632eba8622843427991f41fdd4a305d69aab4455bf6131995d25a9969189df05d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fr \
libreoffice-l10n-fr \
locale-libreoffice-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-fr-FR"

inherit rpm

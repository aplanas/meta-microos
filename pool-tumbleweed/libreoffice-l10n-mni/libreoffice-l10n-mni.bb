SUMMARY = "Manipuri localization files for LibreOffice"
DESCRIPTION = "Provides Manipuri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-mni-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "23130c5c901297fe98ee81dc41c13d51ff7b0c7654ba6dc0db74adc2a7451392840b6db19e299b20774552bf355a69b62066f28ef88d16202233a03e4a3c27c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mni \
libreoffice-l10n-mni \
locale-libreoffice-mni"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

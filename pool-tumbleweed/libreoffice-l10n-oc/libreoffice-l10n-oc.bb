SUMMARY = "Occitan localization files for LibreOffice"
DESCRIPTION = "Provides Occitan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-oc-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "393e54886316193e71dd4a5d8b0c7a970fe8dd48cd09f59d15e3982ed7a31dcd615bfd1958fcc4be83dad5754b3028a8b363f8bbd7b2ea5955435757d740461b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-oc \
libreoffice-l10n-oc \
locale(libreoffice:oc)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-oc_FR"

inherit rpm

SUMMARY = "Tamil localization files for LibreOffice"
DESCRIPTION = "Provides Tamil translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ta-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "f5cdd3dd8850249290a62bd5ff40a765b61f4e1f62cc2cd5ff99d68b0401a87802a7a03f0f52c3332925917fac89684bc3a99c20e3a57747ac241d7431f9bf1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ta \
libreoffice-l10n-ta \
locale-libreoffice-ta"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Spanish localization files for LibreOffice"
DESCRIPTION = "Provides Spanish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-es-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "bb45937783b04f91f501ac1a202145faf2379ebd3bea22fe2cf13a689e9c0137a19a0ef61b791438861cd086a7166368a4f03f623c0da2907d0324273091cbb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-es \
libreoffice-l10n-es \
locale-libreoffice-es"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-es"

inherit rpm

SUMMARY = "Telugu localization files for LibreOffice"
DESCRIPTION = "Provides Telugu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-te-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "9299a8e35316a4c6f55a98ef715523bc03aed964afa7efced08f0f278c7081689e946fc0b2b12c71038eb0fc3acb5bd5e90d5fd03560037f530676cd104e876f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-te \
libreoffice-l10n-te \
locale-libreoffice-te"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-te-IN"

inherit rpm

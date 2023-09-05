SUMMARY = "Bosnian localization files for LibreOffice"
DESCRIPTION = "Provides Bosnian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-bs-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "b591172caa8e87d8afe864f164b1242024d15a494c3751ca794a64813c57f981e62f0a6bfb7e1dcb5912702e711def1248e170e0a1d01a71ca1d72a31bf96eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bs \
libreoffice-l10n-bs \
locale-libreoffice-bs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

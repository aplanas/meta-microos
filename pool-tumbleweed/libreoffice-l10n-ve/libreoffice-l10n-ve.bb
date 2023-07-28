SUMMARY = "Venda localization files for LibreOffice"
DESCRIPTION = "Provides Venda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ve-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "4d9a0596d8067d89f669d718b2f2eba9c2c5273f900d02636c42d27019ff7727c99bac9844a7a375055d2c0658d527bdf680a05b3ef1d16f7f547cfd7ec5ecc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ve \
libreoffice-l10n-ve \
locale-libreoffice-ve"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

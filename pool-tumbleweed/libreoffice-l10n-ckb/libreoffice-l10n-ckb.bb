SUMMARY = "Central_Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Central_Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ckb-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "0054eacc6b0944790e231708a1013221f4433fc5ded308d7934f761e9b74c25fa04cfd3103012d8051ff51dc596a572183f8d0c0b89e48589294dcc6b3348838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ckb \
libreoffice-l10n-ckb \
locale-libreoffice-ckb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

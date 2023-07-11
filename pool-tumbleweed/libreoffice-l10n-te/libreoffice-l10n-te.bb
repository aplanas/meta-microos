SUMMARY = "Telugu localization files for LibreOffice"
DESCRIPTION = "Provides Telugu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-te-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "d1fe171eb9aabe184be626451299971b2e1d363540c5f90c01659ddff37d1382157a85ed935dcd7fb3d2def988860e004ef9766b6237a79fb61e21a38f645db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-te \
libreoffice-l10n-te \
locale-libreoffice-te"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-te-IN"

inherit rpm

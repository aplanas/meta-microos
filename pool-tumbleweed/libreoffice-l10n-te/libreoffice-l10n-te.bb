SUMMARY = "Telugu localization files for LibreOffice"
DESCRIPTION = "Provides Telugu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-te-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "1207052287fa62707525f7516f83dece1da48cd7282dc754df2f5483692894b5f4a2ec45176a6d708c3a0746aeb89c1e188a053bfc89797c2d5f2dc6f076d570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-te \
libreoffice-l10n-te \
locale-libreoffice-te"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-te-IN"

inherit rpm

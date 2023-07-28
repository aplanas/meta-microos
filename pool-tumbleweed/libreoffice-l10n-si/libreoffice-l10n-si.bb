SUMMARY = "Sinhalese localization files for LibreOffice"
DESCRIPTION = "Provides Sinhalese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-si-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "fb504c02239c0756e707d62355e22c9108715c1f2b094aa7ed86532af51afe824d6f85b04b3e327ab81a1add8cd2934cde77c74d56e2337957e25feadcb27d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-si \
libreoffice-l10n-si \
locale-libreoffice-si"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-si-LK"

inherit rpm

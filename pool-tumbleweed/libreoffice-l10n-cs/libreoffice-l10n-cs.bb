SUMMARY = "Czech localization files for LibreOffice"
DESCRIPTION = "Provides Czech translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-cs-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "2ebbc3101df27b1f57cb2e49ced0c6c70b4dee138d4e54e1c03df2d0106367d534aa1d9c48c10c4cdddb31dfd1b9113b1b41baee2f17faa115bb418eff2072ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cs \
libreoffice-l10n-cs \
locale-libreoffice-cs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-cs-CZ"

inherit rpm

SUMMARY = "Bengali localization files for LibreOffice"
DESCRIPTION = "Provides Bengali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bn-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "fc0d5e56d65a48dafe495e4b4c43c1e0a52feb09bf031e7d9cd8e587c42615a68fe5db117b7ff6aef9638f43ce03420ea6686fc0358b6268be6fad97674d477d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn \
libreoffice-l10n-bn \
locale-libreoffice-bn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-BD"

inherit rpm

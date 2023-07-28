SUMMARY = "Lithuanian localization files for LibreOffice"
DESCRIPTION = "Provides Lithuanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-lt-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "18e3a9a3227c393c3332015f03aa7081a7982a53a4aef09c29c143e7485004fc4d480116d66e97875964bb60706b2ce7b6c37cfaec8436a85f3e03dcd651d76c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lt \
libreoffice-l10n-lt \
locale-libreoffice-lt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lt-LT"

inherit rpm

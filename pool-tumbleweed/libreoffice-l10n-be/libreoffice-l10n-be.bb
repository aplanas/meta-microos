SUMMARY = "Belarusian localization files for LibreOffice"
DESCRIPTION = "Provides Belarusian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-be-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "c2ed4b78e21b736cdfe01f1d64f4a6da0d2adfb7f42697fd96623f2f8cd1354e6e0e28abc72046d0e90f17a3c48a016d69e22bc9a43fbbe7f2198a295dcaeca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-be \
libreoffice-l10n-be \
locale-libreoffice-be"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-be-BY"

inherit rpm

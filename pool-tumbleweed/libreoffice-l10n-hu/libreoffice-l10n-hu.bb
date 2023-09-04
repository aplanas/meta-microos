SUMMARY = "Hungarian localization files for LibreOffice"
DESCRIPTION = "Provides Hungarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-hu-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "9fe592d3d0185b0cb08214fadb53e7a8bfe9a018f7b4f5112be93f07953bcba36db50cacde86672fa7d3cb84b3309d1791471aeaa5adb8e307713ffbb180ecc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hu \
libreoffice-l10n-hu \
locale-libreoffice-hu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hu-HU"

inherit rpm

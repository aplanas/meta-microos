SUMMARY = "Italian localization files for LibreOffice"
DESCRIPTION = "Provides Italian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-it-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "906208ee0fadf473c2c42554227f9124987e28c7f46196172124ef402a7668d4b1378a644545e1e5c2b98ce463d67b2c54df00e7d80bd720f0528dfc080a8ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-it \
libreoffice-l10n-it \
locale-libreoffice-it"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-it-IT"

inherit rpm

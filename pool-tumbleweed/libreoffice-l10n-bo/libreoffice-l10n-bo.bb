SUMMARY = "Tibetian localization files for LibreOffice"
DESCRIPTION = "Provides Tibetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-bo-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "51c40ee5bc50024ece47f4c53fe65e2bdbfd9fdd1e63993366cffe04024807b707f1e9db149fc002455f3aa0d2e24dd1870a1642fae7c957adfecfb0c2e06d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bo \
libreoffice-l10n-bo \
locale-libreoffice-bo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bo"

inherit rpm

SUMMARY = "Frisian localization files for LibreOffice"
DESCRIPTION = "Provides Frisian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-fy-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "86824e095f91807d39d68b01976ba88bacb2b218f7038276816b0bd59a12574d294093b9597ebe10724e01ed8530267cc03a834fc58637a14c5bc11699dfac1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fy \
libreoffice-l10n-fy \
locale-libreoffice-fy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

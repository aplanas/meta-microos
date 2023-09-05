SUMMARY = "Irish localization files for LibreOffice"
DESCRIPTION = "Provides Irish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ga-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a9af08cd0533f80c76abeeb2f53368307a9d4a1314603ac73dee72b46284e56517d23d3a93d569279a302a32558c3c3f9d62f12a8c36c4a822c8d1361f2cbb30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ga \
libreoffice-l10n-ga \
locale-libreoffice-ga"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

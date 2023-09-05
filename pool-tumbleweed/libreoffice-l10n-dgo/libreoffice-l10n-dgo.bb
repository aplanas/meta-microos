SUMMARY = "Dogri localization files for LibreOffice"
DESCRIPTION = "Provides Dogri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-dgo-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "85a24775ad6bcece7a5d3e539350cbad78e3b6383e8b3290ae382240e3871cf277bc61b151e34cca8786a6774c09a1ad174cf608d967820ad8cc03f4edd53352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dgo \
libreoffice-l10n-dgo \
locale-libreoffice-dgo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

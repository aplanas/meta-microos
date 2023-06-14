SUMMARY = "Sidamo localization files for LibreOffice"
DESCRIPTION = "Provides Sidamo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sid-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "730e80cdc327993bd36cd0690759750567fbaba7ed683e3af561721aabf8c8c87be2e8d3ab15dc07ea58486bf441759fcab76a129cc115847bd0b91f62f4a878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sid \
libreoffice-l10n-sid \
locale-libreoffice-sid"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

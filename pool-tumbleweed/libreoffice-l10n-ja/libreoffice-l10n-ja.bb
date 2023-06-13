SUMMARY = "Japanese localization files for LibreOffice"
DESCRIPTION = "Provides Japanese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ja-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "24f00cc4c0b754763a9e37487f5ba68e6e5dc5a0132602d1143b0570fbf497eabf5cdeae4a7fd497ef33681cd66d3cb8bc604dfffe5c1ffb0572f09149588739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ja \
libreoffice-l10n-ja \
locale(libreoffice:ja)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

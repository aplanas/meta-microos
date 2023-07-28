SUMMARY = "Frisian localization files for LibreOffice"
DESCRIPTION = "Provides Frisian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fy-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "08ae6006d7e17d318c302adde9f388408c028a984095f72ef16567f6f6f898a701df1ee9ce7c08405a0f2d84d3c7fe75ecfd9103e904da779bb91968d0a0e890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fy \
libreoffice-l10n-fy \
locale-libreoffice-fy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

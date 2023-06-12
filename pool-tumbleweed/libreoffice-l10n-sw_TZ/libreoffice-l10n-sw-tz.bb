SUMMARY = "Swahili localization files for LibreOffice"
DESCRIPTION = "Provides Swahili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sw_TZ-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "29cb087a0538522cb629c5a19521775129b536fb0d0c420a5bbcc654dacaab40c376275ef4bc832c9eaded517832e4e71a57460e24b9710bc36620b98b3395fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sw-TZ \
libreoffice-help-sw_TZ \
libreoffice-l10n-sw_TZ \
locale(libreoffice:sw_TZ)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sw_TZ"

inherit rpm

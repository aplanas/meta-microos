SUMMARY = "Sanskrit localization files for LibreOffice"
DESCRIPTION = "Provides Sanskrit translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-sa_IN-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "ae6ae6c172447830e02503c7936ff0926db7009ee857ba1bef2880183d247ca5ea0bfaeff0a91112b227f941c0ecfff85e3e7751c7e0f4824da5600b9fe4576e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sa-IN \
libreoffice-l10n-sa-IN \
locale-libreoffice-sa-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

SUMMARY = "Macedonian localization files for LibreOffice"
DESCRIPTION = "Provides Macedonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-mk-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "971cf6b8848527440d61d698f635fd820c2277256b270c8760549131f1cf84bfe2b7d396cd4eb1cb6d6f5a0d45ac8d8b428ed21d39a35b7f8f561bd97a299796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mk \
libreoffice-l10n-mk \
locale-libreoffice-mk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

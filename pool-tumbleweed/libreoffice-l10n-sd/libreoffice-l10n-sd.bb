SUMMARY = "Sindhi localization files for LibreOffice"
DESCRIPTION = "Provides Sindhi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sd-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "b74cdd95cb5bce7af61c5a38cd2709d6d53ae8f7aa65dc5daf618f490bde933e5a78d8d1c9855b6bc435f9483b59864af46a8eb56e2fbf5aa1fa7e93534f7397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sd \
libreoffice-l10n-sd \
locale-libreoffice-sd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

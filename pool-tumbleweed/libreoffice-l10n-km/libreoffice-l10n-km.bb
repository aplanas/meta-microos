SUMMARY = "Khmer localization files for LibreOffice"
DESCRIPTION = "Provides Khmer translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-km-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "1f9a2e89ff1c2becdfd7438788bb2c8a065b005da3f8bab37155a90e396d59cdfa04080129c645fb659cf470ca1250df75a52c4b024c38dd5394a8ead8fb4ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-km \
libreoffice-l10n-km \
locale-libreoffice-km"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

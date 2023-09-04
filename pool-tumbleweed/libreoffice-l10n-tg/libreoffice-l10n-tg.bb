SUMMARY = "Tajik localization files for LibreOffice"
DESCRIPTION = "Provides Tajik translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-tg-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "23f8ec7a68014118288c6e8c39a6e02361082bee0de47a69f85bcb4f7c90cdcb0a0c364773e0054b5ce680a097961a1be72d507cbdb8b1d229d19f42aaedef0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tg \
libreoffice-l10n-tg \
locale-libreoffice-tg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

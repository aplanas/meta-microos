SUMMARY = "Sindhi localization files for LibreOffice"
DESCRIPTION = "Provides Sindhi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sd-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "490b31fa99bd81fe7d06fd4c26a1dba0a10e0c37971671f89f7b4446419af5dad45585e2ecd8b4f54ec3401f664d6ab6a86bd8ea30722462e1d609feaf43923d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sd \
libreoffice-l10n-sd \
locale-libreoffice-sd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

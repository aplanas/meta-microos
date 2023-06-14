SUMMARY = "Kabyle localization files for LibreOffice"
DESCRIPTION = "Provides Kabyle translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-kab-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "05dee3b6379b5a88eee85dc255af2e6098d105cf276ecb679dd7547f2994ecd7e6bf250873272ee26b76fd16e0b80bcf699e0798af3a06730ce8953b842fa3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kab \
libreoffice-l10n-kab \
locale-libreoffice-kab"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

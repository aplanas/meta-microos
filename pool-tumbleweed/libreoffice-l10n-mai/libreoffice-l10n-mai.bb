SUMMARY = "Maithili localization files for LibreOffice"
DESCRIPTION = "Provides Maithili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-mai-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "6e2ba7674b4de8c514a9e356fb648f19e591f8eddfbc8ee71ac0a469565802e67825f763d726ff2973bc1aa685f8c277b1d9fd52249c31b4d3b070893bf1e031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mai \
libreoffice-l10n-mai \
locale-libreoffice-mai"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

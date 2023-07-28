SUMMARY = "Esperanto localization files for LibreOffice"
DESCRIPTION = "Provides Esperanto translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-eo-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "63511023e0c00aeb9fe0824a515d628bf99bbbdae3a731ec4fb661e90873e25565d093762794c68d03c6d33430510dee32559cdc5442d9a2e003fde6de3a8f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eo \
libreoffice-l10n-eo \
locale-libreoffice-eo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

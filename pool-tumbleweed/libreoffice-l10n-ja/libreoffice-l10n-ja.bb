SUMMARY = "Japanese localization files for LibreOffice"
DESCRIPTION = "Provides Japanese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ja-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "84b10af3536f49bfdef38a7480eaf2a3360fa2ab12e4cdb4e68c0f08cf3a99c0dcee0218aadc904d97e0d218ef523f751dfe6f664e5280747842fb35c371a4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ja \
libreoffice-l10n-ja \
locale-libreoffice-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

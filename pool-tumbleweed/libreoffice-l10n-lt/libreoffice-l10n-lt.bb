SUMMARY = "Lithuanian localization files for LibreOffice"
DESCRIPTION = "Provides Lithuanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-lt-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "1a1ca103e599bcb7c19a2ca4f3ad098aed40b9a8b79121afe048ed3fde05d7cd7a8cc659b27be06bf4531363b23be978164363e6db1814b55c57804079ef059f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lt \
libreoffice-l10n-lt \
locale-libreoffice-lt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lt-LT"

inherit rpm

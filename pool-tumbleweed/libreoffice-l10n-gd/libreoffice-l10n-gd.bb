SUMMARY = "Gaelic localization files for LibreOffice"
DESCRIPTION = "Provides Gaelic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-gd-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "de902a82f9f003f058809422fbf4bb5316752acdafd121a8158dbd7b414546cfb980ad4280fd1353223cd639476797b26cfa74c8af020b17a1ae46cd983f3dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gd \
libreoffice-l10n-gd \
locale-libreoffice-gd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gd-GB"

inherit rpm

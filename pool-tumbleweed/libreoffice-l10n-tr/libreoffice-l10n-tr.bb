SUMMARY = "Turkish localization files for LibreOffice"
DESCRIPTION = "Provides Turkish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-tr-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "073bc7544864bda6cf759d644a7d08cf72ef52ada41ac2a08e8a93c1703e18401e03664b8e422f586b22ff8bae5c5fdde8f228bebef1558a6fcd598ffd009b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tr \
libreoffice-l10n-tr \
locale-libreoffice-tr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-tr-TR"

inherit rpm

SUMMARY = "Thai localization files for LibreOffice"
DESCRIPTION = "Provides Thai translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-th-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "85b945035d0535aca89c3bd85f63f62f23d77252408efc65c5654f7928e63a14ce87e049080dbcaf806fca501d03646f5cbdb7cd260017a3e3c9cf629b4a9020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-th \
libreoffice-l10n-th \
locale-libreoffice-th"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-th-TH"

inherit rpm

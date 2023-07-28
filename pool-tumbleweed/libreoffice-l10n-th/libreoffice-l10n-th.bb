SUMMARY = "Thai localization files for LibreOffice"
DESCRIPTION = "Provides Thai translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-th-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "40d2ff4b3d6afa9c38493551536720ff7ea2fa926bd3cc4856e0bdde8fac078bafcbfcc5044132e7d6ff1c2ec1273f01175a033ed404824a4ff959659c56fd9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-th \
libreoffice-l10n-th \
locale-libreoffice-th"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-th-TH"

inherit rpm

SUMMARY = "Khmer localization files for LibreOffice"
DESCRIPTION = "Provides Khmer translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-km-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "c7ffeb9646518340c947858d44f659dd0f2ed1601f98da09074f3b78e2a1f6f69d3a7a0e7e4d2d995f4098a713698603305c3f1693d37fcdb282f6089b16323c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-km \
libreoffice-l10n-km \
locale-libreoffice-km"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

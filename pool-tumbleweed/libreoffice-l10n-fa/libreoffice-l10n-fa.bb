SUMMARY = "Farsi localization files for LibreOffice"
DESCRIPTION = "Provides Farsi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-fa-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "16fa4b61c881744d3b742c4b12e6f37fd8bf8732cf60f142cd8fcbb1ad52e8a4622de2da568625a5117cf4ef156353030c8918967a07f7a4978af073916fcdd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fa \
libreoffice-l10n-fa \
locale-libreoffice-fa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

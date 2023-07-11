SUMMARY = "Farsi localization files for LibreOffice"
DESCRIPTION = "Provides Farsi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fa-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "117152a18a65643587ce89575de505f133c8f6d55bacb6b247e7fb72de69e178467ef753d3a6cd3ffceba542d429ce8e4846220819a0ca63ceab82746eaf47e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fa \
libreoffice-l10n-fa \
locale-libreoffice-fa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

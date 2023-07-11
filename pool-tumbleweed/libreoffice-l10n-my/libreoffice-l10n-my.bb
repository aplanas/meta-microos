SUMMARY = "Burnese localization files for LibreOffice"
DESCRIPTION = "Provides Burnese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-my-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "74e4191c3ac225e224ff828c591265505bf7ebc64e82d6232ab70c91fb81a8b2f75925dd3f6a2db47bb1748ec36879ab0fbb732d359233d29371ff280430f925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-my \
libreoffice-l10n-my \
locale-libreoffice-my"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm

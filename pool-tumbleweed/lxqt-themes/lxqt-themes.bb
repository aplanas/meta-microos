SUMMARY = "Themes, graphics and icons for LXQt"
DESCRIPTION = "Themes, graphics and icons for LXQt."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-themes-1.3.0-1.1.noarch.rpm"
RPM_HASH = "0c7cb253ae09057a3bce0d555e4c01d4fa22e90679837e308bc6a5afcffb6aa45079ffe7046efa0b482e8c8da885678588fc6694870714b527126680981e184b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-themes"

RDEPENDS:${PN} += ""

inherit rpm

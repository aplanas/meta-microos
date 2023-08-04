SUMMARY = "The KDE Plasma Workspace Cursors"
DESCRIPTION = "This package contains the Oxygen cursor set."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "oxygen5-cursors-5.27.7-1.1.noarch.rpm"
RPM_HASH = "354d265e9906613400bed1b318d26e52dbeb3d21f88147424d99875c442d62248d14895bceded3b602f1ddce5b90f743324872e512a1679a940d130547005d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-cursors \
oxygen-cursors4 \
oxygen-cursors5 \
oxygen4-cursors \
oxygen5-cursors"

RDEPENDS:${PN} += ""

inherit rpm

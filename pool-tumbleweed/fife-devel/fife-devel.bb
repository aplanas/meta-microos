SUMMARY = "Development files for the FIFE 2D game engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "fife-devel-0.4.2-5.17.aarch64.rpm"
RPM_HASH = "c197e4dbf2dc8757dd6836ae14135381631a8c9d7bc6d4809ade65f2ae1b2c04a50dd6d2b8879e0a4c64f413b122b30f77648f207b6c0b983019d6b1d11d60a3"

RPROVIDES:${PN} += "fife-devel"

RDEPENDS:${PN} += "libfife0-4-2 \
python3-fife"

inherit rpm

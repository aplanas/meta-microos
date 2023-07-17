SUMMARY = "Non-ABI stable API for the Qt 6 3DInput library"
DESCRIPTION = "This package provides private headers of libQt63DInput that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dinput-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5af8f9a59e33c2df087f80d89cfd2b923ab3548ce0ddcb7b7dbe87e6032bd42134cb12df0d56949c367a1a1d7e68c0b6c26c1fcb49f71ccae1c216ad12ea511d"

RPROVIDES:${PN} += "qt6-3dinput-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DInput \
qt6-3dcore-private-devel \
qt6-core-private-devel"

inherit rpm

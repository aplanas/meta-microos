SUMMARY = "Non-ABI stable API for the Qt 6 Multimedia Library"
DESCRIPTION = "This package provides private headers of libQt6Multimedia that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f643f47605af4d5a4b5a448788689d77d353e78417a01c7475bddcc661adb1fa9c9db0ebcfbbca320c535bb97e3022851163d66b2dcaf9f3650c0c5ed787c01b"

RPROVIDES:${PN} += "qt6-multimedia-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Multimedia \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm

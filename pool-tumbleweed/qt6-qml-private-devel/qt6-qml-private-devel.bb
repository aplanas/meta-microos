SUMMARY = "Non-ABI stable API for the Qt 6 Qml library"
DESCRIPTION = "This package provides private headers of libQt6Qml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qml-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "b2bbc3703a76995708a88a103e62f680755a859a0727c1c3572abeec2f0657b3cccc4ec3b1109e1f279c495444eaacf16996ad8eb2b7532abcf6c505b896dd4e"

RPROVIDES:${PN} += "qt6-qml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
qt6-core-private-devel"

inherit rpm

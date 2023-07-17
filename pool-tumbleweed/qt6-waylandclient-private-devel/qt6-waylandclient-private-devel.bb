SUMMARY = "Non-ABI stable API for the Qt 6 WaylandClient library"
DESCRIPTION = "This package provides private headers of libQt6WaylandClient that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandclient-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "ca502ad04791d4f3a2462a0c869313ca1a23e4fbcbf6af4b8371705c24e55b4db0b088bd893a8589302db827e6a7753b8a1cd8a852e2f13827bd99a3381fe04c"

RPROVIDES:${PN} += "qt6-waylandclient-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandClient \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm

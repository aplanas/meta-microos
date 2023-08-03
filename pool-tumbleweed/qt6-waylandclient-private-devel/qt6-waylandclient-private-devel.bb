SUMMARY = "Non-ABI stable API for the Qt 6 WaylandClient library"
DESCRIPTION = "This package provides private headers of libQt6WaylandClient that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-waylandclient-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a9389f468fbe7da224889a2679b34a92b0ce53947dee8bc9d92cf476193a4d04f72ce0adaabc4b4374b9c1b7ec74d4826ece8bea02c9538e48c487c386eb8a96"

RPROVIDES:${PN} += "qt6-waylandclient-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandClient \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm

SUMMARY = "Non-ABI stable API for the Qt 6 3DCore library"
DESCRIPTION = "This package provides private headers of libQt63DCore that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dcore-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "445403cff5a616d38850af208531a7afbcb5023bb3b762edd142a396201b3721faa72ee0265a292b4c09764b52e0762a2c46600163163ca3127844a949d0c568"

RPROVIDES:${PN} += "qt6-3dcore-private-devel \
qt6-3dcore-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DCore)"

inherit rpm

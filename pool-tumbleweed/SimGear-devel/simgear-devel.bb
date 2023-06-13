SUMMARY = "Development libraries and headers for SimGear"
DESCRIPTION = "Development headers and libraries for building applications against \
SimGear."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & MIT"

PV = "2020.3.18"

RPM_NAME = "SimGear-devel-2020.3.18-1.1.aarch64.rpm"
RPM_HASH = "fd5d5b86f2163a7aeba5835ca14a5bb4b15d2ed9f2d5d80f4d942188f7855352618bab5856b61032c96a839e723877bfc73cb8066691bb28d687223b24eafbf4"

RPROVIDES:${PN} += "SimGear-devel \
SimGear-devel(aarch-64) \
cmake(SimGear)"

RDEPENDS:${PN} += "libOpenSceneGraph-devel \
libSimGearCore-2020_3_18 \
pkgconfig(liblzma) \
pkgconfig(openal) \
pkgconfig(zlib) \
udns-devel"

inherit rpm

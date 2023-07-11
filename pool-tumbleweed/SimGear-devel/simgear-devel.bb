SUMMARY = "Development libraries and headers for SimGear"
DESCRIPTION = "Development headers and libraries for building applications against \
SimGear."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & MIT"

PV = "2020.3.18"

RPM_NAME = "SimGear-devel-2020.3.18-1.2.aarch64.rpm"
RPM_HASH = "93cbd2a59f29d68829c5a7c57bc8d1ba1c2b5ade3de51c325a45ed46881a909e6ed1b22aaf22f02d5a7a54fda2a5ae638814d465a8ce1c14cf2f153cc6092ca5"

RPROVIDES:${PN} += "SimGear-devel \
cmake-SimGear"

RDEPENDS:${PN} += "libOpenSceneGraph-devel \
libSimGearCore-2020-3-18 \
pkgconfig-liblzma \
pkgconfig-openal \
pkgconfig-zlib \
udns-devel"

inherit rpm

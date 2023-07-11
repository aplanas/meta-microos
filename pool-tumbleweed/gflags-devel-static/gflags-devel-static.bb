SUMMARY = "Development files for the static gflags library"
DESCRIPTION = "This package contains all necessary include files and the static libraries \
needed for developing applications."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "gflags-devel-static-2.2.2-3.2.aarch64.rpm"
RPM_HASH = "8f29b4653921ee2cf45f803299f346ae7cdc58800d16faf73f08b46c8e0fec8046dfc8d443d34a74d188126d2c40b2cb16d917646c99e19fb5d9634e68f7a2a0"

RPROVIDES:${PN} += "cmake-gflags \
gflags-devel-static \
pkgconfig-gflags-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm

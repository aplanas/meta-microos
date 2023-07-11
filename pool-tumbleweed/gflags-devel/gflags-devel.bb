SUMMARY = "Development files for the dynamic gflags library"
DESCRIPTION = "This package contains all necessary include files and the dynamic libraries \
needed for developing applications."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "gflags-devel-2.2.2-3.2.aarch64.rpm"
RPM_HASH = "eeb21c38550205f28afc3c505e21d68c3e6cb0939884c235b2a0920f945b53c6e3ce04842c34a2fc3ec9934e929c29388894955119345a9b3ac6db0c6277d48f"

RPROVIDES:${PN} += "cmake-gflags \
gflags-devel \
pkgconfig-gflags"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgflags2-2"

inherit rpm

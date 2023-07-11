SUMMARY = "Development headers and files for libbsd"
DESCRIPTION = "The libbsd-ctor static library is required if setproctitle() is to be used \
when libbsd is loaded via dlopen() from a threaded program.  This can be \
configured using 'pkg-config --libs libbsd-ctor'."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "libbsd-ctor-static-0.11.7-2.2.aarch64.rpm"
RPM_HASH = "3bfe841927dc0a6d0b2ab3622f3d420ab2274a7301f204950fc02f2daee1ee85ecc4e3e04063d055b8de7f2c835f0f30be6042cbff017f97924a478e653925af"

RPROVIDES:${PN} += "libbsd-ctor-static \
pkgconfig-libbsd-ctor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbsd0 \
pkgconfig \
pkgconfig-libbsd"

inherit rpm

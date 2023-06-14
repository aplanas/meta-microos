SUMMARY = "Development headers and files for libbsd"
DESCRIPTION = "The libbsd-ctor static library is required if setproctitle() is to be used \
when libbsd is loaded via dlopen() from a threaded program.  This can be \
configured using 'pkg-config --libs libbsd-ctor'."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "libbsd-ctor-static-0.11.7-2.1.aarch64.rpm"
RPM_HASH = "f00145cd59e4ebede7cc05e105681d0235c846a367c26bb5bf08f5d1b966f5c672a99e774eb74d51eba9443a3a440b36a7a94c0f8afc70e4686bca2eaffab897"

RPROVIDES:${PN} += "libbsd-ctor-static \
pkgconfig-libbsd-ctor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbsd0 \
pkgconfig \
pkgconfig-libbsd"

inherit rpm

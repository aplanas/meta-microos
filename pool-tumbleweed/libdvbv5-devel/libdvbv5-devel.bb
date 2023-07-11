SUMMARY = "Development files for libdvbv5"
DESCRIPTION = "The libdvbv5-devel package contains libraries and header files for \
developing applications that use libdvbv5."
LICENSE = "GPL-2.0-only"

PV = "1.24.1"

RPM_NAME = "libdvbv5-devel-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "784dc7bc4022daf131a89671c8360cc44a5f4f5ce2c792e55cf06f4e648e02e248fe827acbbe99e3529e938449fd2991356c1f833d1495ef91421b4d81b67ec5"

RPROVIDES:${PN} += "libdvbv5-devel \
pkgconfig-libdvbv5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdvbv5-0 \
pkgconfig-libudev"

inherit rpm

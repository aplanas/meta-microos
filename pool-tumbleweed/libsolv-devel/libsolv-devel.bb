SUMMARY = "Development files for libsolv, a package solver"
DESCRIPTION = "Development files for libsolv, a library for solving packages and \
reading repositories."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "libsolv-devel-0.7.24-1.4.aarch64.rpm"
RPM_HASH = "d5c1594d48d020bd7395d445ffea2ad4e8389ea461647dc702197a4410bbb3d2b0cf0834823de79e6efd758ecec5d1de1117ba754b1e6db9e8c19322750ac35a"

RPROVIDES:${PN} += "libsolv-devel \
pkgconfig-libsolv \
pkgconfig-libsolvext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
pkgconfig-libsolv \
rpm-devel"

inherit rpm

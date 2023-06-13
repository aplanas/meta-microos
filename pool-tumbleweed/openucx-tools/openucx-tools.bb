SUMMARY = "OpenUCX utilities"
DESCRIPTION = "Miscallaneous utilities for Unified Communication X."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "openucx-tools-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "dc60dc4be6d7564c94c8346920578d010540b7b1a2e84c9b49785f1ac6d99da7c733a276f19f310a317d5fa5e2710e4454b483cf2ba3ef77892bd1b7a6d46e7c"

RPROVIDES:${PN} += "openucx-tools \
openucx-tools(aarch-64) \
pkgconfig(ucx)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libucp.so.0()(64bit) \
libucs.so.0()(64bit) \
libuct.so.0()(64bit) \
pkgconfig(ucx-ucs) \
pkgconfig(ucx-uct)"

inherit rpm

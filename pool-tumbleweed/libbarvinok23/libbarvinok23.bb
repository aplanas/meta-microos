SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.6"

RPM_NAME = "libbarvinok23-0.41.6-1.4.aarch64.rpm"
RPM_HASH = "608a968e510ce62c6ab7071c65234e40c2c3035528a8650d5c8d5901c51d38d886fb1bdc09951a612bf33f6097631bb1c8d31c003ef79299025d26c59e4c04c8"

RPROVIDES:${PN} += "libbarvinok.so.23 \
libbarvinok23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglpk.so.40 \
libgmp.so.10 \
libisl.so.23 \
libntl.so.44 \
libpolylibgmp.so.8 \
libstdc++.so.6"

inherit rpm

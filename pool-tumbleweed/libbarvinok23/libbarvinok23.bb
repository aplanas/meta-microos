SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.7"

RPM_NAME = "libbarvinok23-0.41.7-1.1.aarch64.rpm"
RPM_HASH = "dd724baf57d4bf1ffeb2bc43bf996e0661826b0a6e1f11dcb4e547613b3d2ffb2fb01e0dec3086b1eb3b220a80fe600bf701418844a49cdedc3767b9da684a68"

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

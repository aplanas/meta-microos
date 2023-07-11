SUMMARY = "C++ library for symbolic calculations"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language."
LICENSE = "GPL-2.0-only"

PV = "1.8.6"

RPM_NAME = "libginac11-1.8.6-1.1.aarch64.rpm"
RPM_HASH = "fef63f3f6e497e8bb2cd51102b32f7884e26a84be8fbd5b89ec3585c8f5b82bcdac2766e446ecb6b2b825bab1844a3ac6e158d7788590a74d13a83e10735108b"

RPROVIDES:${PN} += "libginac.so.11 \
libginac11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcln.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

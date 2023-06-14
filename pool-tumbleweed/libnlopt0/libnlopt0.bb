SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "libnlopt0-2.7.1-3.7.aarch64.rpm"
RPM_HASH = "c1329656e3d72182dd646263b736cc8d0deee157058212dc7696edb1e682db42644ff092b4ec14658fa2fc5663a3330826e3f2767c6cd23e3a0239d5527d72f7"

RPROVIDES:${PN} += "libnlopt.so.0 \
libnlopt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

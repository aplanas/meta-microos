SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "7.5.0+r278197"

RPM_NAME = "libgo11-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "1539300030250dfd130e4769dcc9c811d8194ff84812ce1a7fc831661bc3028f10b37cc677a09745f91bc5bdf5b0ea50e3473803aa14b1e6ef475a7615a0ecb8"

RPROVIDES:${PN} += "libgo.so.11 \
libgo11"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm

SUMMARY = "An event dispatching library"
DESCRIPTION = "libivykis is a thin wrapper over various OS'es implementation of I/O \
readiness notification facilities (such as poll(2), kqueue(2)) and is \
mainly intended for writing portable high-performance network \
servers."
LICENSE = "LGPL-2.1-only"

PV = "0.42.4"

RPM_NAME = "libivykis0-0.42.4-1.9.aarch64.rpm"
RPM_HASH = "99e02db0ec60b8b0e2d3c23b447640978587c01bae2bc52f9fd465851324fb0e68ae20da4399a2cad15617723804be35635a48c041ec1da0bb05c44bbcb79692"

RPROVIDES:${PN} += "libivykis.so.0()(64bit) \
libivykis0 \
libivykis0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

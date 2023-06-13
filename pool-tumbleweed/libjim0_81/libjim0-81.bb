SUMMARY = "A small embeddable Tcl interpreter"
DESCRIPTION = "Jim is an opensource small-footprint implementation of the Tcl programming language."
LICENSE = "BSD-2-Clause"

PV = "0.81"

RPM_NAME = "libjim0_81-0.81-1.3.aarch64.rpm"
RPM_HASH = "504a357a7280b3253ba7d8531dd002580fe3e8a881c61533a7f1a2b3d6f51856832428e0a09c8b0cc1ff481477b6fcf939673798d9928dceeb07a7fa9e47c29e"

RPROVIDES:${PN} += "libjim.so.0.81()(64bit) \
libjim0_81 \
libjim0_81(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm

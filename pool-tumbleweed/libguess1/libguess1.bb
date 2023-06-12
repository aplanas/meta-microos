SUMMARY = "Shared library for libguess"
DESCRIPTION = "A high-speed character set detection library \
 \
This package contains the shared libguess library."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libguess1-1.2-1.26.aarch64.rpm"
RPM_HASH = "2d44fdec6e8d9462ad484d93b9ff14672f2a566547091b0a06b086202d17228054a1ad36f1bf807e76f4a3a0e819956f0763e1a24d54b36ec9cbfdfaff5a8e27"

RPROVIDES:${PN} += "libguess.so.1()(64bit) \
libguess1 \
libguess1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

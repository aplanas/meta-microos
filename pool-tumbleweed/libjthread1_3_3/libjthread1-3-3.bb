SUMMARY = "A thread wrapper library"
DESCRIPTION = "The JThread package provides some classes to make use of threads on \
different platforms. The classes are actually wrappers around \
existing thread implementations."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "libjthread1_3_3-1.3.3-1.19.aarch64.rpm"
RPM_HASH = "01dc3fee77039a3fbfa1ac0eb3308090c649e4eb93c411f5cf0bc038fb78e702f1a5563cb9460715c5623ed78af169e2f2e58f8bfdfaab9d6eb5a84581c47f32"

RPROVIDES:${PN} += "libjthread.so.1.3.3()(64bit) \
libjthread1_3_3 \
libjthread1_3_3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm

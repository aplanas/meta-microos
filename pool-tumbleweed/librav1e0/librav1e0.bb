SUMMARY = "AV1 encoder library"
DESCRIPTION = "rav1e is an AV1 video encoder libary. It is designed to eventually cover all \
use cases, though in its current form it is most suitable for cases where \
libaom (the reference encoder) is too slow."
LICENSE = "BSD-2-Clause"

PV = "0.6.4+0"

RPM_NAME = "librav1e0-0.6.4+0-1.1.aarch64.rpm"
RPM_HASH = "69edcac4e3a6aded127cdc753c8c7b836f70fbb6665c2426ae6131b85132636ed5ab21bbed8e8429c53e3606198a73215e34ce57acfa83a1e4f0a7a62167918a"

RPROVIDES:${PN} += "librav1e.so.0()(64bit) \
librav1e0 \
librav1e0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

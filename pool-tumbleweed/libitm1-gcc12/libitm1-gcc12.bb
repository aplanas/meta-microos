SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libitm1-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "204c8b5c3be2543c81650ece01b82f4052554cdc3ca4696ab60fac6cd2c7d2f819958db272bd0f03d1fdc6fcb6e7b073a0184a1836ab58f46c31e5aaefd83721"

RPROVIDES:${PN} += "libitm.so.1()(64bit) \
libitm.so.1(LIBITM_1.0)(64bit) \
libitm.so.1(LIBITM_1.1)(64bit) \
libitm1 \
libitm1-gcc12 \
libitm1-gcc12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

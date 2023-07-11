SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libitm1-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "e48d486fab78c1386d35711ecfd7ef3ef0ea78274983ac817e983a8db50572f341b2384b4c8b1359f79ff60ce868319169b95936ba028c596a833c28a9285380"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1 \
libitm1-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm

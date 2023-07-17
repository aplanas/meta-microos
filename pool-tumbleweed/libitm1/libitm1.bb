SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7552"

RPM_NAME = "libitm1-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "eed61680e013af59a0d1847c32482d6bd2b80ad037d1f1c223631e34a0c89c52271cc63b1ffd5619b6aa8daa291377b705486c87daa200af8208efa56727945d"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm

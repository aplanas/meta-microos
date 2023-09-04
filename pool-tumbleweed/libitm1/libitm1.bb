SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.2.1+git7683"

RPM_NAME = "libitm1-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "9393c9afa91ea9dae2c6cac2b87791e6f0d08d392dfccf6ee2c448b71939285bf683b2f02f6371108c51615601de1178077a1a3bc957c5cfc65692521a5674e8"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm

SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7597"

RPM_NAME = "libitm1-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "1ad8ff343febbcb7e5355196b6e17c264d7f73e123ff5df561aa43efe03a0f891d245d63c18bef9d216492722fe93a64a18173d3bd6e5b0509d4c9d1ff55fd6d"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm

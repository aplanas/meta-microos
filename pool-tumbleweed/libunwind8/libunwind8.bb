SUMMARY = "Call chain detection library for process self-inspection"
DESCRIPTION = "A C programming interface (API) to determine the call chain of a \
program from within the same process."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "libunwind8-1.6.2-4.5.aarch64.rpm"
RPM_HASH = "0fbab2b31e2ad55bddbfb8ed66136c1941622e198fd9f525d7449baca1335827ce42ec982c810ea3be14528b47929ce28ef9e2a9146081ae1135ee198f5456e9"

RPROVIDES:${PN} += "libunwind-aarch64.so.8 \
libunwind.so.8 \
libunwind8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5"

inherit rpm

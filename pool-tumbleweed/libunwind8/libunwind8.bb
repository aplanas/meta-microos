SUMMARY = "Call chain detection library for process self-inspection"
DESCRIPTION = "A C programming interface (API) to determine the call chain of a \
program from within the same process."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "libunwind8-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "ac77a1e729accf875c3eefd6c3a34997bf7616eb50002e1ace9b38c93647a73b450363bec060c21fcf25be250b43992a2988eb223454890f2bca74f81fa384df"

RPROVIDES:${PN} += "libunwind-aarch64.so.8 \
libunwind.so.8 \
libunwind8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5"

inherit rpm

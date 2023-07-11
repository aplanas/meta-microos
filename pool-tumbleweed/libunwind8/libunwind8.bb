SUMMARY = "Call chain detection library for process self-inspection"
DESCRIPTION = "A C programming interface (API) to determine the call chain of a \
program from within the same process."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "libunwind8-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "72c456b39432adc2d4ca548ff9dd37e91d3d6fef494544a58f073c20161eb177d06186b1bc3d46d7525dbd70ac9c97f67a519e30798a56f177c729e752fbbaf1"

RPROVIDES:${PN} += "libunwind-aarch64.so.8 \
libunwind.so.8 \
libunwind8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5"

inherit rpm

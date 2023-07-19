SUMMARY = "Apple's Grand Central Dispatch library"
DESCRIPTION = "Grand Central Dispatch (GCD or libdispatch) provides support for \
concurrent code execution on multicore hardware."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "libdispatch1_3-5.6.3-2.1.aarch64.rpm"
RPM_HASH = "89d782081f5c115150d14462db20ee6fddeff30996dfb75ca4de3a0501919fa18877de531243846583229208097ee48a81dc2ed4d82e5bd750eddd1eaa998a18"

RPROVIDES:${PN} += "libBlocksRuntime.so.1.3 \
libdispatch \
libdispatch.so.1.3 \
libdispatch1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

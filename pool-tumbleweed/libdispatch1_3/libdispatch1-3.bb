SUMMARY = "Apple's Grand Central Dispatch library"
DESCRIPTION = "Grand Central Dispatch (GCD or libdispatch) provides support for \
concurrent code execution on multicore hardware."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "libdispatch1_3-5.6.3-1.2.aarch64.rpm"
RPM_HASH = "396196b4b12093850cc68c6d3cfb643385123b650be63dd0b43610f5b741657a88eda38eacc631563b2aee927e7f195beb2961a48db4084fdb625d41862d8e34"

RPROVIDES:${PN} += "libBlocksRuntime.so.1.3()(64bit) \
libdispatch \
libdispatch.so.1.3()(64bit) \
libdispatch1_3 \
libdispatch1_3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

SUMMARY = "Apple's Grand Central Dispatch library"
DESCRIPTION = "Grand Central Dispatch (GCD or libdispatch) provides support for \
concurrent code execution on multicore hardware."
LICENSE = "Apache-2.0"

PV = "5.6.3"

RPM_NAME = "libdispatch1_3-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "b795a4f7aceca9589881ccb0782de3ab6988172072fed9e40ea5fbc2ecde447f51407240e921ddf6562d94f71fc44fa1519aa44e9944940142519ee8ea6e1610"

RPROVIDES:${PN} += "libBlocksRuntime.so.1.3 \
libdispatch \
libdispatch.so.1.3 \
libdispatch1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

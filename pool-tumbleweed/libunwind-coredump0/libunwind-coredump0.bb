SUMMARY = "Call chain detection library for coredump images"
DESCRIPTION = "A C programming interface (API) to determine the call chains \
of the threads in coredump images."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "libunwind-coredump0-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "2be911bf56afb746f3d0cf6fec99a17210281d8303dcb9e8c2352de7f60e72d39e8bab7c15d6a598bcd9b947488f3c1ff98577873c52a6e7274bfcf6190df803"

RPROVIDES:${PN} += "libunwind-coredump.so.0 \
libunwind-coredump0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libunwind-aarch64.so.8"

inherit rpm

SUMMARY = "Dynamic to Persistent Memory allocation translation library"
DESCRIPTION = "The libvmmalloc library transparently converts all the dynamic memory \
allocations into persistent memory allocations. This allows the use \
of persistent memory as volatile memory without modifying the target \
application. \
 \
The typical usage of libvmmalloc is to load it via the LD_PRELOAD \
environment variable."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "libvmmalloc1-1.8-2.9.aarch64.rpm"
RPM_HASH = "6206a27ec5d5f3c5414fd5c35785a40c39f9ef12c45e2aa3be58282dd3dd0002db25d27140e6129a72cdc2e58c2b1dd596f145d4ff70059c2144fa11922827a9"

RPROVIDES:${PN} += "libvmmalloc.so.1()(64bit) \
libvmmalloc1 \
libvmmalloc1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

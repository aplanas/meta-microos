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

RPM_NAME = "libvmmalloc1-1.8-2.10.aarch64.rpm"
RPM_HASH = "61bffaa6700d6692233d8d3867f9316bccb8277b6852e44dc2db3e865f08f9df15bb6743d7b543ee83f3b742ebdfe773285795fdedf5d441ebe2fb8a0281ed11"

RPROVIDES:${PN} += "libvmmalloc.so.1 \
libvmmalloc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

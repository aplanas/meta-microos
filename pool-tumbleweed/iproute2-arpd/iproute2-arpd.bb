SUMMARY = "Userspace ARP daemon"
DESCRIPTION = "The arpd daemon collects gratuitous ARP information, saving it on \
local disk and feeding it to the kernel on demand to avoid redundant \
broadcasting due to limited standard size (512..1024 entries, \
depending on type) of the kernel ARP cache."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "iproute2-arpd-6.3-1.1.aarch64.rpm"
RPM_HASH = "69acebe1f4cbb0e08c6526635a837e416cb70dc86e3674e199c977d1a2067418565c6b8283aa806ad12a68f763f27806925fd37fbfce10049748af7c978e93ee"

RPROVIDES:${PN} += "iproute2-/usr/sbin/arpd \
iproute2-arpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm

SUMMARY = "Userspace ARP daemon"
DESCRIPTION = "The arpd daemon collects gratuitous ARP information, saving it on \
local disk and feeding it to the kernel on demand to avoid redundant \
broadcasting due to limited standard size (512..1024 entries, \
depending on type) of the kernel ARP cache."
LICENSE = "GPL-2.0-only"

PV = "6.4"

RPM_NAME = "iproute2-arpd-6.4-1.1.aarch64.rpm"
RPM_HASH = "585ed7b2126e212785c38d4dfe3deff28b534ba947bc8ce5bec64325cec8e6116ff0792729ed6946deaeaeec5bbdccfd03838363bf6ab3bbc246de990d0cacd2"

RPROVIDES:${PN} += "iproute2-/usr/sbin/arpd \
iproute2-arpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm

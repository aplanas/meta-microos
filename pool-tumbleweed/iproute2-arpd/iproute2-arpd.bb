SUMMARY = "Userspace ARP daemon"
DESCRIPTION = "The arpd daemon collects gratuitous ARP information, saving it on \
local disk and feeding it to the kernel on demand to avoid redundant \
broadcasting due to limited standard size (512..1024 entries, \
depending on type) of the kernel ARP cache."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "iproute2-arpd-6.3-1.2.aarch64.rpm"
RPM_HASH = "afbfdbc3ebabbe11173bb7bd988bd188e3c45cdfe6036a158a7daf70fc3db4a6fcb1084ede52951ce8e9c30900853b2b2999246a854459538a6ca7481e6e3765"

RPROVIDES:${PN} += "iproute2-/usr/sbin/arpd \
iproute2-arpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm

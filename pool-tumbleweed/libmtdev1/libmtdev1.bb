SUMMARY = "Multitouch Protocol Translation Library"
DESCRIPTION = "The mtdev is a stand-alone library which transforms all variants of kernel MT events to the slotted type B protocol. The events put into mtdev may be from any MT device, specifically type A without contact tracking, type A with contact tracking, or type B with contact tracking. See the kernel documentation for further details."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libmtdev1-1.1.6-1.10.aarch64.rpm"
RPM_HASH = "45d8db974aecdc696606b38d5270a0dc64a4e580a2779874ca9f031d7d2863b715f56f65820e929ea908a7096153e1cbc1682714c1b3c02b3f051b6fad81f5e7"

RPROVIDES:${PN} += "libmtdev.so.1 \
libmtdev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

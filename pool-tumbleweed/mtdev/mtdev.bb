SUMMARY = "Multitouch Protocol Translation Library"
DESCRIPTION = "The mtdev is a stand-alone library which transforms all variants of kernel MT events to the slotted type B protocol. The events put into mtdev may be from any MT device, specifically type A without contact tracking, type A with contact tracking, or type B with contact tracking. See the kernel documentation for further details."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "mtdev-1.1.6-1.10.aarch64.rpm"
RPM_HASH = "68b09c4277b4dceaa205963813f145304d4d0ad0dcb172f36772713b4581127b4ef5c5bba1a24a15879506500710a5e3f0dc597ba7e6490290d31639accc10c9"

RPROVIDES:${PN} += "mtdev \
mtdev(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmtdev.so.1()(64bit)"

inherit rpm

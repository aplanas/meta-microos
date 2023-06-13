SUMMARY = "System diagnosis tools from hxtools"
DESCRIPTION = "This subpackage contains programs from the hxtools suite that \
give info about available system components. \
 \
* clock_info(1) – show available system clocks for clock_gettime(2) \
* pmap_dirty(1) — display amount of RAM a process uses hard \
* sysinfo(1) — print IRC-style system information banner"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "sysinfo-20230411-1.1.aarch64.rpm"
RPM_HASH = "fd9f61742e06bb3025076943dedab6e5cec802e7264b7eab30f2eb3d9731cfb51fb2e3c0001111735a9188a5ecb4c2bf47a49bf1757d607ddeda2a265beb6d26"

RPROVIDES:${PN} += "sysinfo \
sysinfo(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libHX.so.32()(64bit) \
libHX.so.32(LIBHX_3.25)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmount.so.1()(64bit) \
libmount.so.1(MOUNT_2.19)(64bit) \
libpci.so.3()(64bit) \
libpci.so.3(LIBPCI_3.0)(64bit) \
libpci.so.3(LIBPCI_3.5)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm

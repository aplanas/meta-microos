SUMMARY = "System diagnosis tools from hxtools"
DESCRIPTION = "This subpackage contains programs from the hxtools suite that \
give info about available system components. \
 \
* clock_info(1) – show available system clocks for clock_gettime(2) \
* pmap_dirty(1) — display amount of RAM a process uses hard \
* sysinfo(1) — print IRC-style system information banner"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "sysinfo-20230411-1.2.aarch64.rpm"
RPM_HASH = "f6e6ddbf83568cc555eedd132813d663f8f8abc4c5613afb3b63c22a17b33f3b47a55df71784fff10c6099ae9bbd72b5a5beb5262361fad9d27895671488d8f6"

RPROVIDES:${PN} += "sysinfo"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libmount.so.1 \
libpci.so.3 \
libxcb.so.1"

inherit rpm

SUMMARY = "Check processes"
DESCRIPTION = "This plugin checks the number of currently running processes and generates \
WARNING or CRITICAL states if the process count is outside the specified \
threshold ranges. \
 \
The process count can be filtered by process owner, parent process PID, current \
state (e.g., 'Z'), or may be the total number of running processes."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-procs-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "589b6f5dfd4f7de9996f9225d06c7304e69b62a0bc3dbafb9b821d367746c49253f86d1bd14766097f58ee13ec735f2a9b352d0398ecea8b22af420cc7fc14eb"

RPROVIDES:${PN} += "config(monitoring-plugins-procs) \
monitoring-plugins-procs \
monitoring-plugins-procs(aarch-64) \
monitoring-plugins-procs_perf \
nagios-plugins-procs"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

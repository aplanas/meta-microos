SUMMARY = "Check processes"
DESCRIPTION = "This plugin checks the number of currently running processes and generates \
WARNING or CRITICAL states if the process count is outside the specified \
threshold ranges. \
 \
The process count can be filtered by process owner, parent process PID, current \
state (e.g., 'Z'), or may be the total number of running processes."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-procs-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "7e70d5ad87fade95482f014fb62301677f626bf68907fabeb0137d8b90e7c72e9677030ddf3e4a033e1d5362e343cea02af6ca9c81f1213d74fa1ff593bd217f"

RPROVIDES:${PN} += "config-monitoring-plugins-procs \
monitoring-plugins-procs \
monitoring-plugins-procs-perf \
nagios-plugins-procs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

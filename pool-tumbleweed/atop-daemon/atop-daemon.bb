SUMMARY = "System Resource and Process Monitoring History Daemon"
DESCRIPTION = "Atop is an ASCII full-screen performance monitor, similar to the top \
command. At regular intervals, it shows system-level activity related to \
the CPU, memory, swap, disks and network layers, and it shows for every \
active process the CPU utilization in system and user mode, the virtual \
and resident memory growth, priority, username, state, and exit code. The \
process level activity is also shown for processes which finished during \
the last interval, to get a complete overview about the consumers of things \
such as CPU time. Atop only shows the active system-resources and processes, \
and only shows the deviations since the previous interval. \
 \
This subpackage contains the permanent monitoring daemon, to store history \
information about processes and system resources."
LICENSE = "GPL-2.0-only"

PV = "2.9.0"

RPM_NAME = "atop-daemon-2.9.0-1.2.aarch64.rpm"
RPM_HASH = "bd54ef3d4b29a53e77b9bbf092cbeaf686fd5d8baf8e80818b8f7966167cc86e74fb967458123de798accffed8dc9e3a08ea07b72ca3dafa88e5ac7512d287a7"

RPROVIDES:${PN} += "atop-daemon \
config-atop-daemon"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
atop \
libc.so.6"

inherit rpm

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

PV = "2.8.1"

RPM_NAME = "atop-daemon-2.8.1-1.3.aarch64.rpm"
RPM_HASH = "3186c8f22d2b47828aa33c0250d9be3bb31cd1fa4120c53824bf75e7c7f0682ee1e3554bc6280834d66a30dcc84b1d59d13678423730b5577bc90936dc625544"

RPROVIDES:${PN} += "atop-daemon atop-daemon(aarch-64) config(atop-daemon)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 atop libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

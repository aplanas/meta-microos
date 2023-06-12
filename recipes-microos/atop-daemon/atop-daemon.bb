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

RPM_NAME = "atop-daemon-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "bae2a0ab54ab40e9d68952a6febe4b41b09463b62ddd1b8b32c50886a47abc5a522b312275140279813a588fb09c1c1051c0eb5a66ca4ee15979f90a45594fde"

RPROVIDES:${PN} += "atop-daemon atop-daemon(aarch-64) config(atop-daemon)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 atop libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

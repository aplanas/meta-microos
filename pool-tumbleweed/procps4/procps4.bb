SUMMARY = "The ps utilities for /proc"
DESCRIPTION = "The procps package contains a set of system utilities that provide \
system information. Procps includes ps, free, skill, snice, tload, top, \
uptime, vmstat, w, and watch. The ps command displays a snapshot of \
running processes. The top command provides a repetitive update of the \
statuses of running processes. The free command displays the amounts of \
free and used memory on your system. The skill command sends a \
terminate command (or another specified signal) to a specified set of \
processes. The snice command is used to change the scheduling priority \
of specified processes. The tload command prints a graph of the current \
system load average to a specified tty. The uptime command displays the \
current time, how long the system has been running, how many users are \
logged on, and system load averages for the past one, five, and fifteen \
minutes. The w command displays a list of the users who are currently \
logged on and what they are running. The watch program watches a \
running program. The vmstat command displays virtual memory statistics \
about processes, memory, paging, block I/O, traps, and CPU activity."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "procps4-4.0.3-3.1.aarch64.rpm"
RPM_HASH = "d314808214f0a936e8bb384062ccc9471632b3f50659de216ec65f8bd0d53d633a9295f49f4b9c1818112acde7d152d5afd0edb7dbae1067740c3f49f2c53ae0"

RPROVIDES:${PN} += "/usr/bin/ps \
procps \
procps4 \
ps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libproc2.so.0 \
libtinfo.so.6"

inherit rpm

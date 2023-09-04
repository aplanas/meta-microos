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

PV = "3.3.17"

RPM_NAME = "procps-3.3.17-14.1.aarch64.rpm"
RPM_HASH = "ebc0683f99ac568cd0e5c487c3eb47d4271b05e526c88b1919290c1825c7f6df926ffc370f5900cf34a967ca3225756e4250cb3e3f44b35f09cf49ebcd9ffc3a"

RPROVIDES:${PN} += "/usr/bin/ps \
procps \
ps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libncursesw.so.6 \
libprocps.so.8 \
libprocps8 \
libtinfo.so.6"

inherit rpm

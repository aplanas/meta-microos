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

RPM_NAME = "procps-3.3.17-12.3.aarch64.rpm"
RPM_HASH = "a040f560b59357253782fc10af8ef8e4b0f92bc2f0417abb4d079a3dd7680a40792577d3c44016e4ac8573da7153847d86bd5528edb2e703aa1bea2c9bdd3daf"

RPROVIDES:${PN} += "/bin/ps \
procps \
procps(aarch-64) \
ps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncurses.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libprocps.so.8()(64bit) \
libprocps.so.8(LIBPROCPS_0)(64bit) \
libprocps8 \
libtinfo.so.6()(64bit)"

inherit rpm

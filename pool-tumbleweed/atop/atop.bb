SUMMARY = "Monitor for System Resources and Process Activity"
DESCRIPTION = "Atop is an ASCII full-screen performance monitor, similar to the top \
command. At regular intervals, it shows system-level activity related to \
the CPU, memory, swap, disks and network layers, and it shows for every \
active process the CPU utilization in system and user mode, the virtual \
and resident memory growth, priority, username, state, and exit code. The \
process level activity is also shown for processes which finished during \
the last interval, to get a complete overview about the consumers of things \
such as CPU time. Atop only shows the active system-resources and processes, \
and only shows the deviations since the previous interval."
LICENSE = "GPL-2.0-only"

PV = "2.9.0"

RPM_NAME = "atop-2.9.0-1.2.aarch64.rpm"
RPM_HASH = "cd1e35485043f304c08fac27e23827435f5338c8ce979a17bdaf46e618583db3b0a9de027ad0d220a34143aba5fa3b0f13541948d816fb398c2e2d3f74dd909c"

RPROVIDES:${PN} += "atop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libz.so.1 \
systemd"

inherit rpm

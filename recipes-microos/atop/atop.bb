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

PV = "2.8.1"

RPM_NAME = "atop-2.8.1-1.3.aarch64.rpm"
RPM_HASH = "6a58e26b855f94a97a38d5dba1618e3bd929f1763f29a3292a5bd62bac56ac9c7b86a5f29001a75fe9cf45d559ec733a6772d11b74ba962d7c0e0348547f8f57"

RPROVIDES:${PN} += "application() application(atop.desktop) atop atop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libz.so.1()(64bit) systemd"

inherit rpm

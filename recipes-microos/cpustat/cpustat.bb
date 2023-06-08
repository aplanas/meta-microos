SUMMARY = "Periodic cpu utilization statistics"
DESCRIPTION = "cpustat periodically reports the current CPU utilization of running tasks and \
can optionally report per CPU and per task utilization statistics at the end \
of a run. \
cpustat has been designed and optimized to use a minimal amount of CPU cycles \
to monitor a system hence it is a light weight alternative to traditional \
process monitoring tools such as top."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.15"

RPM_NAME = "cpustat-0.02.15-1.8.aarch64.rpm"
RPM_HASH = "66de73b1276899eab574986cea4853b92d8ab6589852517de43f509d2e5ab36a7840be7ce542eb63937b2872ac2a945c4b22e3e8adbfd8d05b424f2d157e49c1"

RPROVIDES:${PN} += "cpustat cpustat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm

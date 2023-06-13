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

RPM_NAME = "atop-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "2398e3ab320b6c58d0847544420fa13438141ee9e4253beafb1e13db0604fca0c039bf494f7f64ad1b02f6733313d7ea03fcf0f07285c1c969ff440d04540c20"

RPROVIDES:${PN} += "application() \
application(atop.desktop) \
atop \
atop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit) \
systemd"

inherit rpm

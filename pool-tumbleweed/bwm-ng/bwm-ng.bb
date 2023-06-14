SUMMARY = "Realtime Bandwidth Monitor"
DESCRIPTION = "Bandwidth Monitor NG is a console-based live bandwidth monitor. \
 \
- supports /proc/net/dev, netstat, getifaddr, sysctl, kstat and libstatgrab \
- unlimited number of interfaces supported \
- interfaces are added or removed dynamically from list \
- white-/blacklist of interfaces \
- output of KB/s, Kb/s, packets, errors, average, max and total sum \
- output in curses, plain console, CSV or HTML \
- configfile"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.3"

RPM_NAME = "bwm-ng-0.6.3-1.9.aarch64.rpm"
RPM_HASH = "5697f46bc6b5c425b763fe44156b44cf84550c050cdcebe540958e1f17fcac48b39673dd8ae8b6c8d684b5ad94e33201b8ada5f338e84f11b1384a0d46843cc1"

RPROVIDES:${PN} += "bwm-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libstatgrab.so.10 \
libtinfo.so.6"

inherit rpm

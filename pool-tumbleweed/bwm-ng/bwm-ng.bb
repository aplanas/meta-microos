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

RPM_NAME = "bwm-ng-0.6.3-1.10.aarch64.rpm"
RPM_HASH = "9870aa31013820fb25d2e31a25adec7a48d4124ac5fae67bae7b7cafd7500508c418829f921be750a109e7ba77526c483907bcc7e3131b263b84f7213ba6fd9e"

RPROVIDES:${PN} += "bwm-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libstatgrab.so.10 \
libtinfo.so.6"

inherit rpm

SUMMARY = "Kernel event states monitoring tool"
DESCRIPTION = "Eventstat periodically dumps out the current kernel event state.It keeps track \
of current events and outputs the change in events on each output update. \
The tool requires sudo to run since it needs to write to /proc/timer_stats to \
start and stop the event monitoring."
LICENSE = "GPL-2.0-or-later"

PV = "0.04.13"

RPM_NAME = "eventstat-0.04.13-1.5.aarch64.rpm"
RPM_HASH = "d820d6f3f1c8ca2ba3ce1e85c0b7217b1f8d40b806ae4ed238af55fc337fcace349ff9664fc48d29fed77a901c61502313c4d84a5138ade93b7a63e1a94d6fca"

RPROVIDES:${PN} += "eventstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm

SUMMARY = "Process monitoring tool"
DESCRIPTION = "Health-check monitors processes and optionally their child \
processes and threads for a given amount of time.  At the end \
of the monitoring it will display the CPU time used, wakeup \
events generated and I/O operations of the given processes. \
It can be used to diagnose unhealthy bad processes."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.09"

RPM_NAME = "health-check-0.03.09-1.11.aarch64.rpm"
RPM_HASH = "d51da82a5bd04bfdf671c2b6df9e02ec7349685a1d3af1d468d54ddadffc05f6c3e260d042aa8b315c4013d04f6c54044b23ff717d4ab8757ceafecf768a3321"

RPROVIDES:${PN} += "health-check"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libjson-c.so.5"

inherit rpm

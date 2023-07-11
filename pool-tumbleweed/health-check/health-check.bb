SUMMARY = "Process monitoring tool"
DESCRIPTION = "Health-check monitors processes and optionally their child \
processes and threads for a given amount of time.  At the end \
of the monitoring it will display the CPU time used, wakeup \
events generated and I/O operations of the given processes. \
It can be used to diagnose unhealthy bad processes."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.09"

RPM_NAME = "health-check-0.03.09-1.12.aarch64.rpm"
RPM_HASH = "5d08318f2041a731ca035d7fa56f8d65545cf87ce4a99cee1a72ed255ba6f4d3201058f76089741e4f450b681dd67275a479890031668ed4574f5719966fbc37"

RPROVIDES:${PN} += "health-check"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libjson-c.so.5"

inherit rpm

SUMMARY = "Check nagios server"
DESCRIPTION = "This plugin checks the status of the Nagios process on the local machine. The \
plugin will check to make sure the Nagios status log is no older than the \
number of minutes specified by the expires option. \
 \
It also checks the process table for a process matching the command argument."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-nagios-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "2bd33b2d5d9d6dadea9d4918cbafb751dc85c808e27f271aea4c0e7a5ae9630de627c6b80b1237d3ca8f14f2b307ae1abefe1894d265c9f0d2d4e2c802d670bd"

RPROVIDES:${PN} += "monitoring-plugins-nagios \
nagios-plugins-nagios"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
monitoring-daemon"

inherit rpm

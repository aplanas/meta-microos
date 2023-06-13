SUMMARY = "Check nagios server"
DESCRIPTION = "This plugin checks the status of the Nagios process on the local machine. The \
plugin will check to make sure the Nagios status log is no older than the \
number of minutes specified by the expires option. \
 \
It also checks the process table for a process matching the command argument."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-nagios-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "7649424b03fc0f40961e83cf88a256d16c2d48cf8bbc52b5d9b847976749ed431232bf768bb5538490495705253465892a3ee8aac35f36d4e9481269088f9fd6"

RPROVIDES:${PN} += "monitoring-plugins-nagios \
monitoring-plugins-nagios(aarch-64) \
nagios-plugins-nagios"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
monitoring_daemon"

inherit rpm

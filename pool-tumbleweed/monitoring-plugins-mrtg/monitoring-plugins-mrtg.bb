SUMMARY = "Check average or maximum value in an MRTG logfile"
DESCRIPTION = "This plugin will check either the average or maximum value of one of the \
two variables recorded in an MRTG log file."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-mrtg-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "3225cd3654fa0a80b3151f013240c607b0f1f28f5f6d94acd201b93f60b22e80fa380b1fe1535955bfd51344cacd5aca71fca50d343149663cd68a3097893fc9"

RPROVIDES:${PN} += "monitoring-plugins-mrtg \
nagios-plugins-mrtg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

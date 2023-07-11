SUMMARY = "Check clock offset with the ntp server"
DESCRIPTION = "This plugin checks the clock offset between the local host and a remote NTP \
server. It is independent of any commandline programs or external libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ntp_time-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "c6613af00af9c68fd8f9f025dca0cc5201c7caf5b3351f06de546108aaa1d5eab3cf1b413ce82ad9005a762b9ba66c06929ad51892023e79c2f5118945f36fd7"

RPROVIDES:${PN} += "config-monitoring-plugins-ntp-time \
monitoring-plugins-ntp \
monitoring-plugins-ntp-time \
nagios-plugins-ntp-time"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

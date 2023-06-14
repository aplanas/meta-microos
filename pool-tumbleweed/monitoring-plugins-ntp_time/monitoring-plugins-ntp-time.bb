SUMMARY = "Check clock offset with the ntp server"
DESCRIPTION = "This plugin checks the clock offset between the local host and a remote NTP \
server. It is independent of any commandline programs or external libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ntp_time-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "a0f6a35e0d00cb8d7ce6b68ad7d5cba5b4495ce56f8b9db09f4cf2ecf0f11080fab14c16a7c4d15d43925402d4f75d6a03eaba6521708670a6dee2b6e0b4d1c2"

RPROVIDES:${PN} += "config-monitoring-plugins-ntp-time \
monitoring-plugins-ntp \
monitoring-plugins-ntp-time \
nagios-plugins-ntp-time"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

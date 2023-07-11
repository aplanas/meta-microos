SUMMARY = "Check health of an NTP server"
DESCRIPTION = "Use this plugin to check the health of an NTP server. It supports \
checking the offset with the sync peer, the jitter and stratum. \
 \
This plugin will not check the clock offset between the local host and NTP \
server; please use check_ntp_time for that purpose."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ntp_peer-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "284dd538c5f622e3ac676132c3a4a88b69503742f88d2c5fe655595e49f3ce3cc7a256d688b244686442baf7743860a953a5e4b73432614514180d72427f6aea"

RPROVIDES:${PN} += "monitoring-plugins-ntp-peer \
nagios-plugins-ntp-peer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

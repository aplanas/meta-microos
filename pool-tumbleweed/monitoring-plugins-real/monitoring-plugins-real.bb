SUMMARY = "Test REAL service"
DESCRIPTION = "This plugin will attempt to open an RTSP connection with the host.  Successul \
connects return STATE_OK, refusals and timeouts return STATE_CRITICAL, other \
errors return STATE_UNKNOWN.  Successful connects, but incorrect reponse \
messages from the host result in STATE_WARNING return values."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-real-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "00f2b97effe17d55e4a1024404aca00a8e8eda8eb544b50dddee2f6004462e9e3cbe3ec8dbe753fdb2425e4862ed911b38101082a84fe36f6c6ef1c9e8d4f53c"

RPROVIDES:${PN} += "monitoring-plugins-real \
monitoring-plugins-real(aarch-64) \
nagios-plugins-real"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm

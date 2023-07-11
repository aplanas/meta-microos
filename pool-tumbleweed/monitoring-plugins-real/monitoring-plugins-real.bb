SUMMARY = "Test REAL service"
DESCRIPTION = "This plugin will attempt to open an RTSP connection with the host.  Successul \
connects return STATE_OK, refusals and timeouts return STATE_CRITICAL, other \
errors return STATE_UNKNOWN.  Successful connects, but incorrect reponse \
messages from the host result in STATE_WARNING return values."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-real-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "be536d8d262e695a2ffa11bf90977096a26b4da9d99d2a9f8a1516340eaf1a3147995ebaa4bbeb148e089a663f5bd558240f380c0b48c76037cbc15af1f977cd"

RPROVIDES:${PN} += "monitoring-plugins-real \
nagios-plugins-real"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

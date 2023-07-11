SUMMARY = "Check the time on the specified host"
DESCRIPTION = "This plugin will check the time on the specified host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-time-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "363d2555d7f1ab1fef41a9b07403c34f9daf7c8d41ba4b460104828759661eceb4c6e55386b288f61fcb522a1d1d887b987d5ea779aa58cdec1dfed6b3839547"

RPROVIDES:${PN} += "monitoring-plugins-time \
nagios-plugins-time"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

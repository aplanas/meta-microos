SUMMARY = "Test the uptime of the system"
DESCRIPTION = "This plugin tests the uptime on the system using /proc/uptime"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-uptime-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "d7f4b7bdbecb63e9686356ea56e9a8d1f6226f0fd1e98387b277436ff3434550c4aae4894ac35ac079cf4f7f42f598278efd81e1ecf0bd52d0430052e2491af8"

RPROVIDES:${PN} += "monitoring-plugins-uptime \
nagios-plugins-ups"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm

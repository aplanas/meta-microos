SUMMARY = "Test the current system load average"
DESCRIPTION = "This plugin tests the current system load average."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-load-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "1abf4e3e8e0afee9adaad5d46a6118b37ec436e5c49024011e1917836dd2df85e2a733eb57d3164aec699ec6eccbf22a215ca686c554f80f62419f2876aba1e4"

RPROVIDES:${PN} += "config-monitoring-plugins-load \
monitoring-plugins-load \
nagios-plugins-load"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

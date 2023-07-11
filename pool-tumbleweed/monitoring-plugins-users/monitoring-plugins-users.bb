SUMMARY = "Check number of users currently logged in"
DESCRIPTION = "This plugin checks the number of users currently logged in on the local system \
and generates an error if the number exceeds the thresholds specified."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-users-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "83100744cf47e0b9400acd39bceaa0bf62ad91a3c2b4754fae157dd76b4d0fd5986b0eefd80f0a976a18524f88c8e4fc5481457b6eec327ce9c0b688a081d118"

RPROVIDES:${PN} += "config-monitoring-plugins-users \
monitoring-plugins-users \
nagios-plugins-users"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

SUMMARY = "All Monitoring-Plugin checks"
DESCRIPTION = "This virtual package recommends all currently available, official \
Monitoring plugins and additional packages that are available in \
https://build.opensuse.org/project/show/server:monitoring"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-all-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "48bd587609e9a05f3f89ce1c94160d0d7f8bf458ec59c96b6842e88d05583b2f09e8459c0fa8121245f0111684f486e993ff9ec625495854b07e1b16b4359069"

RPROVIDES:${PN} += "monitoring-plugins-all \
nagios-plugins-all"

RDEPENDS:${PN} += ""

inherit rpm

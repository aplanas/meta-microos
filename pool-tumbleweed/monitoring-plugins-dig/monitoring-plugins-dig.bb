SUMMARY = "Test DNS service via dig"
DESCRIPTION = "This plugin test the DNS service on the specified host using dig."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dig-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "cc737e73b6b3599ddfa871562fcb3f9d2756351b72b41763922fc4c56bdd992e542dfcc5e0d2548f66cbe4b1f0bc728f7de3e36f20c2716f47a7d9c53bf61247"

RPROVIDES:${PN} += "monitoring-plugins-dig \
nagios-plugins-dig"

RDEPENDS:${PN} += "/usr/bin/dig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

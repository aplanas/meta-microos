SUMMARY = "Check flexlm license managers"
DESCRIPTION = "Flexlm license managers usually run as a single server or three servers and a \
quorum is needed.  The plugin return OK if 1 (single) or 3 (triple) servers \
are running, CRITICAL if 1(single) or 3 (triple) servers are down, and WARNING \
if 1 or 2 of 3 servers are running."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-flexlm-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "791604c8237ea7b643274526e57147f6f8d2293cff58738dc330bc1663484570fdbf32f6646a57192c6984d930f9e1cfd6863be6c1a4e4943e584469b981e2b0"

RPROVIDES:${PN} += "monitoring-plugins-flexlm \
nagios-plugins-flexlm"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl"

inherit rpm

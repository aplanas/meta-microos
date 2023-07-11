SUMMARY = "Check an IRCd server"
DESCRIPTION = "Monitor the status of an Internet Relay Chat daemon (IRCd) with this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ircd-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "1a1d57bdeca82cd6cde085755a6fe8c9cd06f4ea06db2e98d5b8e78fbb9cf2cc14122b53561c621f3e6cabaf4a4e5283d88d7286fd7c3687612668797ca4f7ef"

RPROVIDES:${PN} += "monitoring-plugins-ircd \
nagios-plugins-ircd"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl \
perl-IO--Socket--INET6 \
perl-IO--Socket--SSL"

inherit rpm

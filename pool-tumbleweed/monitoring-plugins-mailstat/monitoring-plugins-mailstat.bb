SUMMARY = "Monitoring mail server statistics"
DESCRIPTION = "This plugin includes a patch for mailgraph so that it will also output its \
statistics counter to an external file(plus the rra file),and a \
check_mailstat.pl which check the stat counter to see if it’s ok, emit \
WARN/CRITICAl result if not.It can run on nagios server, or on remote server \
via NRPE."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "monitoring-plugins-mailstat-0.9.1-102.8.noarch.rpm"
RPM_HASH = "ff2b3d669e70468cc5bb293e8a9943ccca191deed4d0b95a35fa36f28a1e101a1ca5f7fe5fddd6334c3fd7b905861f88528aeeea1a979c48f987e734f5261a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(monitoring-plugins-mailstat) \
monitoring-plugins-mailstat \
nagios-plugins-mailstat"
RDEPENDS:${PN} += "/usr/bin/perl \
mailgraph \
monitoring-plugins-common \
perl(RRDs)"

inherit rpm

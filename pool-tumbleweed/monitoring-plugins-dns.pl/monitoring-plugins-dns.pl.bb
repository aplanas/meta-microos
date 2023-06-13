SUMMARY = "Monitor a DNS server"
DESCRIPTION = "A Perl based monitoring plugin which can be used to monitor a DNS server. It \
forms DNS queries of specific QTYPE and QNAME and sends them directly to the \
DNS server."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "monitoring-plugins-dns.pl-1.0.0-2.10.noarch.rpm"
RPM_HASH = "534730ca9960a7f72e766d08dd38174d05dd3ccefbce477fa5034e5a012de2983a3f83f127205d449588a6342d7955f9086e6d1805e0014e9d0fe177a8425675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-dns.pl \
nagios-plugins-dns.pl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(Getopt::Long) \
perl(IO::Select) \
perl(IO::Socket) \
perl(Socket)"

inherit rpm

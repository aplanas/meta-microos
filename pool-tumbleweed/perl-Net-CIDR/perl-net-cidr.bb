SUMMARY = "Manipulate IPv4/IPv6 netblocks in CIDR notation"
DESCRIPTION = "The Net::CIDR package contains functions that manipulate lists of IP \
netblocks expressed in CIDR notation. The Net::CIDR functions handle both \
IPv4 and IPv6 addresses. \
 \
The cidrvalidate() function, described below, checks that its argument is a \
single, valid IP address or a CIDR. The remaining functions expect that \
their parameters consist of validated IPs or CIDRs. See cidrvalidate() and \
BUGS, below, for more information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "perl-Net-CIDR-0.21-1.11.noarch.rpm"
RPM_HASH = "30d732da488b5bda23e03cb7755f64653d3c2469454760dc013152ca55d9ca75a188316e33f21acba8bfea3e668aae127f81b81139ef46c477c28afa95422c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR \
perl-Net-CIDR"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

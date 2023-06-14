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

RPM_NAME = "perl-Net-CIDR-0.21-1.10.noarch.rpm"
RPM_HASH = "f60b86c80a9336a4e10b567932710b7c3dde488c692b13fb2dcdc2921ff25520d4672b223c0b9bebde79e7dcc285a8baa7dc47d4d3331d7964f9bbd69dce409b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR \
perl-Net-CIDR"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm

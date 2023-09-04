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

RPM_NAME = "perl-Net-CIDR-0.21-1.12.noarch.rpm"
RPM_HASH = "578ab7430ddef20486cb4606d521ff47c20e3712e071e39802b0671fc4f409c1b7415df228d434cc9919f4b9a6b40863aba401a878ea00bc39acc3ec93f8e71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--CIDR \
perl-Net-CIDR"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

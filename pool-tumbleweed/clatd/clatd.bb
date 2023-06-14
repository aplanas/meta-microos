SUMMARY = "CLAT / SIIT-DC Edge Relay implementation for Linux"
DESCRIPTION = "clatd implements the CLAT component of the 464XLAT network architecture \
specified in RFC 6877. It allows an IPv6-only host to have IPv4 \
connectivity that is translated to IPv6 before being routed to an upstream \
PLAT (which is typically a Stateful NAT64 operated by the ISP) and there \
translated back to IPv4 before being routed to the IPv4 internet."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "clatd-1.6-1.1.noarch.rpm"
RPM_HASH = "fae91b66cd8036d381cffe1725df5a719e0aff882519cd651b17b51ac2db449fa7a06f3ab9465cf1bdcaf9e669931f1b5e75994b2eb888e2911a7be49bd9fe03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clatd \
config-clatd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
iproute2 \
iptables \
perl \
perl-File--Temp \
perl-IO--Socket--IP \
perl-Net--DNS \
perl-Net--IP \
tayga"

inherit rpm

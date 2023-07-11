SUMMARY = "CLAT / SIIT-DC Edge Relay implementation for Linux"
DESCRIPTION = "clatd implements the CLAT component of the 464XLAT network architecture \
specified in RFC 6877. It allows an IPv6-only host to have IPv4 \
connectivity that is translated to IPv6 before being routed to an upstream \
PLAT (which is typically a Stateful NAT64 operated by the ISP) and there \
translated back to IPv4 before being routed to the IPv4 internet."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "clatd-1.6-1.2.noarch.rpm"
RPM_HASH = "171e572b44963c40e47d6282e83725bc32cdbe29286fa5808891631eb1dac99a0c6f7af369702a4e3c3d9fcc05617358b90414f731b216b3d053d6d7f192ac80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clatd \
config-clatd"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
iproute2 \
iptables \
perl \
perl-File--Temp \
perl-IO--Socket--IP \
perl-Net--DNS \
perl-Net--IP \
tayga"

inherit rpm

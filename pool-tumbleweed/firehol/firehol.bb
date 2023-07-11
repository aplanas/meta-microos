SUMMARY = "Tools to build stateful firewalls and traffic shaping"
DESCRIPTION = "FireHOL is a language (and a program to run it) which builds stateful firewalls \
from human-readable configuration files. \
 \
FireQOS is a program which sets up traffic shaping from human-readable \
configuration files. \
 \
Both programs abstract away the differences between IPv4 and IPv6, and rules \
for each protocol can be applied as needed."
LICENSE = "GPL-2.0-only"

PV = "3.1.7"

RPM_NAME = "firehol-3.1.7-2.7.noarch.rpm"
RPM_HASH = "871d7426136ee08b93dd2af248c5e44d4d63762f1061e7cbef9b8d2e11e63b07dc19198c270ea480c8d1de5b9b964d3730d51c71431a692c76b9839d135102c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-firehol \
firehol"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
iprange \
iproute2 \
ipset \
iptables \
iputils \
kmod-compat \
nfacct \
procps \
screen \
tcpdump \
traceroute \
util-linux-systemd"

inherit rpm

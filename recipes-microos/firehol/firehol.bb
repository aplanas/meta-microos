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

RPM_NAME = "firehol-3.1.7-2.6.noarch.rpm"
RPM_HASH = "d761fc4c8ab12151c7312d5c6f06b5f79164a9ac3404793bbd005a4e080548719f3fc49b377d4cc163929fa9a667571c77b4bfe5fce5db37ac4c17d606261659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(firehol) firehol"
RDEPENDS:${PN} += "/bin/bash /bin/sh curl iprange iproute2 ipset iptables iputils kmod-compat nfacct procps screen tcpdump traceroute util-linux-systemd"

inherit rpm

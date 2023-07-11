SUMMARY = "Shoreline Firewall 6 is an ip6tables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall 6, more commonly known as 'Shorewall6', is a Netfilter \
(ip6tables) based IPv6 firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall6-5.2.8-5.1.noarch.rpm"
RPM_HASH = "1878373d0e4c12c6e8d96028e60492b4a0602d00cd853862f4c1baeb8185d692737a09b6f6a6b36267688faea334e9b1fdd416a63b313c82cbcbdb02da565538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shorewall6 \
shoreline-firewall \
shorewall6"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/service \
bc \
fillup \
iproute2 \
iptables \
logrotate \
perl-base \
shorewall-core \
systemd"

inherit rpm

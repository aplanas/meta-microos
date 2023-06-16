SUMMARY = "Shoreline Firewall 6 is an ip6tables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall 6, more commonly known as 'Shorewall6', is a Netfilter \
(ip6tables) based IPv6 firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall6-5.2.8-4.2.noarch.rpm"
RPM_HASH = "c6257269541d614667ed9c241b5d101607a5ba80c0ad8740e37327201f53f027e0b1262f1340a2f74fa0220ae90e4fcb7e21d6def96cad192aad6d9213defc24"
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

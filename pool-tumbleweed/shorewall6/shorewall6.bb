SUMMARY = "Shoreline Firewall 6 is an ip6tables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall 6, more commonly known as 'Shorewall6', is a Netfilter \
(ip6tables) based IPv6 firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall6-5.2.8-5.2.noarch.rpm"
RPM_HASH = "22b4c2dab1993294271ab48e20574e21df480bbb4fb17b5c01765e3ff6c4e1737c37ba857cb6425a8b28d3ef039230a7ade36b846c39413409fb6630c36c06da"
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

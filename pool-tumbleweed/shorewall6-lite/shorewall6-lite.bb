SUMMARY = "Shoreline Firewall 6 Lite is an ip6tables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall 6, more commonly known as 'Shorewall6', is a Netfilter \
(ip6tables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall6 Lite is a companion product to Shorewall6 that allows network \
administrators to centralize the configuration of Shorewall6-based firewalls."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall6-lite-5.2.8-5.1.noarch.rpm"
RPM_HASH = "19a4492bb25c9c7741bd12095e00a8ca42fb7e0edf7cc885dcac42b36fb78ac4111de5b14c913bfb83de970662d6aa4bc8a4a6e399451480b1a06d8a348ffad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shorewall6-lite \
shoreline-firewall \
shorewall6-lite"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/service \
bc \
fillup \
iproute2 \
iptables \
logrotate \
shorewall-core \
systemd"

inherit rpm

SUMMARY = "Shoreline Firewall 6 Lite is an ip6tables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall 6, more commonly known as 'Shorewall6', is a Netfilter \
(ip6tables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall6 Lite is a companion product to Shorewall6 that allows network \
administrators to centralize the configuration of Shorewall6-based firewalls."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall6-lite-5.2.8-5.2.noarch.rpm"
RPM_HASH = "7559fde4ee01eb0b6595fba6eaa7f0e318fdde7ea75e01349b499bed73432c49b0721e78ba033daa7ba2bd0e615d063854b082ef9dfb7a40f8cef968875a9e44"
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

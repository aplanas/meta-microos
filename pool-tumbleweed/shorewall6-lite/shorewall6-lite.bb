SUMMARY = "Shoreline Firewall 6 Lite is an ip6tables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall 6, more commonly known as 'Shorewall6', is a Netfilter \
(ip6tables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall6 Lite is a companion product to Shorewall6 that allows network \
administrators to centralize the configuration of Shorewall6-based firewalls."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall6-lite-5.2.8-4.2.noarch.rpm"
RPM_HASH = "824e2a19cf408517bef8623b8f7f80177d66ad3a86854b838a86bfc7d6cbc370bce56beda0a951a515e292cd7f46cf5f9c82fbc9f9bbd70bc2bd71e0788648a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(shorewall6-lite) \
shoreline_firewall \
shorewall6-lite"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
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

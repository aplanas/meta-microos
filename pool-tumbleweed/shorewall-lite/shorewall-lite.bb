SUMMARY = "Shoreline Firewall Lite is an iptables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall Lite is a companion product to Shorewall that allows network \
administrators to centralize the configuration of Shorewall-based firewalls."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-lite-5.2.8-5.1.noarch.rpm"
RPM_HASH = "c420857f07988b1d96d53f9b68acf59c5c753e410632a70aaa224b04698d84693d9d49cb6f0ae7c6e55e7242a4aae644fc052d779c3a52ace330d73f43e63618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shorewall-lite \
shoreline-firewall \
shorewall-lite"

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

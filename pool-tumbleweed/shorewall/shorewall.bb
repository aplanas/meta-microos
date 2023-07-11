SUMMARY = "An iptables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-5.2.8-5.1.noarch.rpm"
RPM_HASH = "0555259f5b494000a2161b975d66c69f3b0ff889aa5da3c4862de3ce55008f70decabc332947664e816c629107dc64979a7c81d5cdeea9a16d98235d6c605f80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-shorewall \
perl-Shorewall--ARP \
perl-Shorewall--Accounting \
perl-Shorewall--Chains \
perl-Shorewall--Compiler \
perl-Shorewall--Config \
perl-Shorewall--IPAddrs \
perl-Shorewall--Misc \
perl-Shorewall--Nat \
perl-Shorewall--Proc \
perl-Shorewall--Providers \
perl-Shorewall--Proxyarp \
perl-Shorewall--Raw \
perl-Shorewall--Rules \
perl-Shorewall--Tc \
perl-Shorewall--Tunnels \
perl-Shorewall--Zones \
shoreline-firewall \
shorewall"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/service \
bc \
fillup \
iproute2 \
iptables \
logrotate \
perl--MODULE-COMPAT-5.36.1 \
perl-base \
shorewall-core"

inherit rpm

SUMMARY = "An iptables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-5.2.8-5.2.noarch.rpm"
RPM_HASH = "5f6dbcd416c343e3d00a441e803999aab60bb74a0e0e51c3cd5d833979e90848890636c119c4bc3113c6651be28a89da83b245e0a5931746ed239fc83da019f7"
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
perl--MODULE-COMPAT-5.38.0 \
perl-base \
shorewall-core"

inherit rpm

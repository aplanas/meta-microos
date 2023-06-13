SUMMARY = "Adds functionality during boot to Shoreline Firewall (Shorewall)"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall Init is a companion product to Shorewall that allows for tigher \
control of connections during boot and that integrates Shorewall with \
ifup/ifdown and NetworkManager."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-init-5.2.8-4.2.noarch.rpm"
RPM_HASH = "4fa2fd71e5fe8603bb47ccc5a142731c822fa9811c443aaa926c81dfce5fb8c37dfdf56c704ee72303a05af077acaa0bc8cb0b04e31e2d6c4c87b79d77e6780c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-init"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
/usr/sbin/service \
fillup \
logrotate \
shoreline_firewall \
systemd"

inherit rpm

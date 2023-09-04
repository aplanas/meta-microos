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

RPM_NAME = "shorewall-init-5.2.8-5.2.noarch.rpm"
RPM_HASH = "f63889a9417924cfa30dff548dbd9a7bcf3679ff80f232192beb94319c6196647294817f3cdb51b32525e4f9f491b13ea4fb7a7a0ebce18f5537340d53fea153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-init"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/service \
fillup \
logrotate \
shoreline-firewall \
systemd"

inherit rpm

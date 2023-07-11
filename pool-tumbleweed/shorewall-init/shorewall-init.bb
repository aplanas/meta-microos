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

RPM_NAME = "shorewall-init-5.2.8-5.1.noarch.rpm"
RPM_HASH = "57d78c97a755b1ec14e39b292f7bb7cff06aedcd481869350c3758314dda5873088ee35b5471b134e100c4db7edbe02699b1fcdc118b401c20b9b7299d1c962f"
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

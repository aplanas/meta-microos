SUMMARY = "Shoreline Firewall Lite is an iptables-based firewall for Linux systems"
DESCRIPTION = "The Shoreline Firewall, more commonly known as 'Shorewall', is a Netfilter \
(iptables) based firewall that can be used on a dedicated firewall system, \
a multi-function gateway/ router/server or on a standalone GNU/Linux system. \
 \
Shorewall Lite is a companion product to Shorewall that allows network \
administrators to centralize the configuration of Shorewall-based firewalls."
LICENSE = "GPL-2.0-only"

PV = "5.2.8"

RPM_NAME = "shorewall-lite-5.2.8-5.2.noarch.rpm"
RPM_HASH = "75e44da608423ace35e2d7498bc92ac0077776a9f1c2ca47ff4463352d9afeea586a331c483adb28dfaf05daa049ad555c2d42d06647ca8e0188924a62e6da3b"
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

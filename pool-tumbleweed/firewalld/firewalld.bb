SUMMARY = "A firewall daemon with D-Bus interface providing a dynamic firewall"
DESCRIPTION = "firewalld is a firewall service daemon that provides a dynamic customizable \
firewall with a D-Bus interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-2.0.0-1.1.noarch.rpm"
RPM_HASH = "54b566a644fcf03306aa46246c08c1faaebd7e20829dcb4cbf062999a9b07220ca514a05584afb6056ae6322bce036909a323aca32f9f991f3d6907ec2ee023b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-firewalld \
firewalld \
firewalld-prometheus-config"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
nftables \
python3-firewall \
python3-gobject \
python3-nftables \
typelib-GObject"

inherit rpm

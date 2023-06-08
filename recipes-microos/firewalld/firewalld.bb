SUMMARY = "A firewall daemon with D-Bus interface providing a dynamic firewall"
DESCRIPTION = "firewalld is a firewall service daemon that provides a dynamic customizable \
firewall with a D-Bus interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-1.3.2-1.1.noarch.rpm"
RPM_HASH = "22e448a3760a98e38a2e83559f22d29b17da33c7cd46e8c3b30a867df992c5cff9b29ad5b8aebc401a750613a4f17547c2aea3b0faebbb2a0d92d5e9f1940ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(firewalld) firewalld firewalld-prometheus-config"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/python3 /usr/bin/touch fillup nftables python3-firewall python3-gobject python3-nftables typelib(GObject)"

inherit rpm

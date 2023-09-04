SUMMARY = "A firewall daemon with D-Bus interface providing a dynamic firewall"
DESCRIPTION = "firewalld is a firewall service daemon that provides a dynamic customizable \
firewall with a D-Bus interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-2.0.0-2.1.noarch.rpm"
RPM_HASH = "230a5e59624532bbe9cc074e72be364c8b3e895121419319892e73db8e95bae5c92ce55025a64c9628de81320c06b12a39c4aa60715c85971f15d146ffe9e6bf"
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

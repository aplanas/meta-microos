SUMMARY = "A firewall daemon with D-Bus interface providing a dynamic firewall"
DESCRIPTION = "firewalld is a firewall service daemon that provides a dynamic customizable \
firewall with a D-Bus interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-1.3.2-2.1.noarch.rpm"
RPM_HASH = "776ed9a8e8652714a8e77002cb97db4691b8e529fc980614f062c1571b3e0e70f97c47ffe677fe8672e222fadbb950f75e3edd68fccd4112e021ae5d8ad1ca4d"
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

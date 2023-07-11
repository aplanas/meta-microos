SUMMARY = "Neighbor Discovery Protocol Proxy Daemon"
DESCRIPTION = "ndppd is a daemon that proxies certain IPv6 NDP messages between two or more \
interfaces. It currently supports proxying Neighbor Solicitation Messages \
and Neighbor Advertisement messages in order to allow IPv6 routing without \
relying on Linux 'proxy_ndp'. \
 \
The daemon is partially compliant with (experimental) RFC4389."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.5.43"

RPM_NAME = "ndppd-0.2.5.43-4.9.aarch64.rpm"
RPM_HASH = "d185a7c891351c0014a23189ad99baeef01bef88d8881c990e16bd148e8bf39fa373c8fe53b21cafc112d9cdb35a58f33cff9075fd24cfbdee4eda49e3a2bec6"

RPROVIDES:${PN} += "config-ndppd \
ndppd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
systemd"

inherit rpm

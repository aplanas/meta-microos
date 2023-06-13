SUMMARY = "TCP proxy for non-IPv6 applications"
DESCRIPTION = "6tunnel allows using services provided by IPv6 hosts with IPv4-only \
applications and vice versa. It can bind to any of the system's IPv4 \
or IPv6 addresses and forward all data to IPv4 or IPv6 hosts. \
 \
It can be used, for example, as an IPv6-capable IRC proxy."
LICENSE = "GPL-2.0-or-later"

PV = "0.13"

RPM_NAME = "6tunnel-0.13-2.2.aarch64.rpm"
RPM_HASH = "be45631876eddf276e1ac42d48bb83366eaf4387c6d9a2084306419de5ccbe751e2e69dea3667cd4f4dbd8e61d9f1384a68389e990d9df4f9149eceb43f73ea7"

RPROVIDES:${PN} += "6tunnel \
6tunnel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

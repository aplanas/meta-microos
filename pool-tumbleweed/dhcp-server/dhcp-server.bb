SUMMARY = "ISC DHCP Server"
DESCRIPTION = "This package contains the ISC DHCP server."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-server-4.4.2.P1-14.3.aarch64.rpm"
RPM_HASH = "dc0cd787d5425d205c9ffacc2d3dd89f0645f174d4ede73c4ff731c0f2b2ba3f85de8e355061315631becc7035466d7be5365d6ff6abdcbe054d13888d20dcbd"

RPROVIDES:${PN} += "config-dhcp-server \
dhcp-server \
group-dhcpd \
user-dhcpd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dhcp \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
sysuser-shadow"

inherit rpm

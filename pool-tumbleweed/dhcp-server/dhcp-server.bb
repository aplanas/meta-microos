SUMMARY = "ISC DHCP Server"
DESCRIPTION = "This package contains the ISC DHCP server."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-server-4.4.2.P1-14.4.aarch64.rpm"
RPM_HASH = "2454633eb97eee55233747a0c3022fb1840399e7dd8d383ce88542d94b04f6b95114c1f51f05286d4467609878acf28a708deb8960858eae442d3b02213abe3a"

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

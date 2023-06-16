SUMMARY = "ISC DHCP Relay Agent"
DESCRIPTION = "This is the ISC DHCP relay agent. It can be used as a 'gateway' for \
DHCP messages across physical network segments. This is necessary \
because requests can be broadcast, and they will normally not be \
routed."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-relay-4.4.2.P1-14.3.aarch64.rpm"
RPM_HASH = "b444374552bb879be19787acbfd132e3df8eb3a3b453ed86994ded6550083dd49108c45f8b5df382dd28669fd6b735685b80cb797ed05e671c3563121a85ad77"

RPROVIDES:${PN} += "dhcp-relay"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dhcp \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

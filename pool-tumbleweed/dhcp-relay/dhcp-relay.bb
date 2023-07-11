SUMMARY = "ISC DHCP Relay Agent"
DESCRIPTION = "This is the ISC DHCP relay agent. It can be used as a 'gateway' for \
DHCP messages across physical network segments. This is necessary \
because requests can be broadcast, and they will normally not be \
routed."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-relay-4.4.2.P1-14.4.aarch64.rpm"
RPM_HASH = "dd17e67d2f6a43e567dd1081aa679b1ee425b313943117f147999548c00621250758673e100e985aa2150e16b36ece33c2dc44f9fae695540621cdd74decfc9e"

RPROVIDES:${PN} += "dhcp-relay"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dhcp \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

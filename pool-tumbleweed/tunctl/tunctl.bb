SUMMARY = "Create and remove virtual network interfaces"
DESCRIPTION = "tunctl is a tool to set up and maintain persistent TUN/TAP network \
interfaces, enabling user applications access to the wire side of a \
virtual nework interface. Such interfaces is useful for connecting VPN \
software, virtualization, emulation and a number of other similar \
applications to the network stack. \
 \
tunctl originates from the User Mode Linux project."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "tunctl-1.5-27.7.aarch64.rpm"
RPM_HASH = "c3acd1c52e390f71a32e7d0d02bf1eec812a971c453bf97b1cf886028b1402d6737845e9e858ddaeff1f7bc844d04ef94fce06c1718a15f198cb2668f5fdc830"

RPROVIDES:${PN} += "tunctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

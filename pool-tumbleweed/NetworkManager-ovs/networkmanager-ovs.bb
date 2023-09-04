SUMMARY = "Open vSwitch device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Open vSwitch bridges."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "NetworkManager-ovs-1.44.0-1.1.aarch64.rpm"
RPM_HASH = "b4b5d6732561e45ee72a5aa259892eb661c25ad6bd54e1ed4f44fd6235472a5f392180a50ed769749b186138989ce726e159f6bc20a181875f2498f74b8ce24c"

RPROVIDES:${PN} += "NetworkManager-ovs \
libnm-device-plugin-ovs.so"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
openvswitch"

inherit rpm

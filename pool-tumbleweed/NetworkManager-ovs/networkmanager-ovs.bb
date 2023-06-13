SUMMARY = "Open vSwitch device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Open vSwitch bridges."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-ovs-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "e28363c43513e74b8631adf3cad0b4f51cfe3d0bcbb798da4a9053eb1726ebcc4a72ea2bdb6b51841de5c50df4e2efedd974aa5d506e5a9695fbb4202c4f2592"

RPROVIDES:${PN} += "NetworkManager-ovs \
NetworkManager-ovs(aarch-64) \
libnm-device-plugin-ovs.so()(64bit)"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjansson.so.4()(64bit) \
openvswitch"

inherit rpm

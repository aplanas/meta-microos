SUMMARY = "Open vSwitch device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Open vSwitch bridges."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "NetworkManager-ovs-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "f05adfab6cb611269d143a24a6cb89d933d5eb524e990ed5bcaf24ca5a2ee56c524cee855e04d6011a8b6394f62a43c049b7564f37aa271072c1280ea7499e66"

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

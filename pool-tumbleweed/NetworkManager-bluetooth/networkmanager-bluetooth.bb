SUMMARY = "Bluetooth device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Bluetooth devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-bluetooth-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "1f1a70921181c782ff93f48a66fb11048ba775761faac213bee184902b4e1203ac90c8b4996adaec1ab172d8106bc95a9183a92d832ee8803f4a042ecec4de8b"

RPROVIDES:${PN} += "NetworkManager-bluetooth \
NetworkManager-bluetooth(aarch-64) \
libnm-device-plugin-bluetooth.so()(64bit)"

RDEPENDS:${PN} += "NetworkManager \
NetworkManager-wwan \
ld-linux-aarch64.so.1()(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnm-wwan.so()(64bit)"

inherit rpm

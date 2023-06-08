SUMMARY = "Bluetooth device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Bluetooth devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-bluetooth-1.42.6-1.1.aarch64.rpm"
RPM_HASH = "93874adafdfd49bdb6323a34f190c43f0e9c11e95d42d8538e57d789baa22807ba3ed9b3b0196f20523e2a22c2e3a3a6e9b8bde7c8e59bef5cf430bbfa593d63"

RPROVIDES:${PN} += "NetworkManager-bluetooth NetworkManager-bluetooth(aarch-64) libnm-device-plugin-bluetooth.so()(64bit)"
RDEPENDS:${PN} += "NetworkManager NetworkManager-wwan ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbluetooth.so.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libnm-wwan.so()(64bit)"

inherit rpm

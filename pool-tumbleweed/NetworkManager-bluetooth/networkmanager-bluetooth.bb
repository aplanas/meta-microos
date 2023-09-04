SUMMARY = "Bluetooth device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Bluetooth devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "NetworkManager-bluetooth-1.44.0-1.1.aarch64.rpm"
RPM_HASH = "82163ec4f24312cd57b4870e800b25dabf9f758cddc7815d14f70c477008d5680b7f42622c44bf296077a6abbd730945b2cbcef7aeb79f19bc3e3e8108067d5b"

RPROVIDES:${PN} += "NetworkManager-bluetooth \
libnm-device-plugin-bluetooth.so"

RDEPENDS:${PN} += "NetworkManager \
NetworkManager-wwan \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm-wwan.so"

inherit rpm

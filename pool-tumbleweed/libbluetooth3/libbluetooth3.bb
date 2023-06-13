SUMMARY = "Bluetooth Libraries"
DESCRIPTION = "BlueZ provides support for the core Bluetooth layers and protocols. \
It is uses a modular implementation. It has many interesting features: \
 \
* Multithreaded data processing \
* Support for multiple Bluetooth devices \
* Real hardware abstraction \
* Standard socket interface to all layers \
* Device and service level security support"
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "libbluetooth3-5.66-1.6.aarch64.rpm"
RPM_HASH = "60e6387ec00875b5ee7170ce862839cf5171dc5c5cf21d0c0b88d32bf943c2eff613e17fd4c8e1a2f3edbe7bff0b0cf5e6a540fbeaea99bbc440ed6404017edb"

RPROVIDES:${PN} += "bluez-libs \
libbluetooth.so.3()(64bit) \
libbluetooth3 \
libbluetooth3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

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

PV = "5.68"

RPM_NAME = "libbluetooth3-5.68-4.1.aarch64.rpm"
RPM_HASH = "f581fdcde00af586e0854ef3b2ec4d0b5172bbad2fca7939321a65bc419170bf9c9cf83e9671baaf71d1330157f866f66adaa39e40fb503d96c62dd8ac76f5ec"

RPROVIDES:${PN} += "bluez-libs \
libbluetooth.so.3 \
libbluetooth3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

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

RPM_NAME = "libbluetooth3-5.68-4.2.aarch64.rpm"
RPM_HASH = "c2308714a32510c1a8c4bb6f3509c8567ba43e4f5d4f9817b88c259b657da7bccb7a4628629a29d4c42ca8455b1e4a4f788bd4b54baca1bdc62077bd2f83fe08"

RPROVIDES:${PN} += "bluez-libs \
libbluetooth.so.3 \
libbluetooth3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

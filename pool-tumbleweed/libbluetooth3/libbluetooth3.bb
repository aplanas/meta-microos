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

RPM_NAME = "libbluetooth3-5.66-1.8.aarch64.rpm"
RPM_HASH = "bf11c81df942ddd8c25c31cfb337361ad9c07296562eb2deeb7d88b9e870accecc08676dc14abe699c10705d74ed10d80079890fa98a8e5f1ae0dcd662839b36"

RPROVIDES:${PN} += "bluez-libs \
libbluetooth.so.3 \
libbluetooth3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

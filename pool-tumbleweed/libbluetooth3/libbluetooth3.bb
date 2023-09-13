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

PV = "5.69"

RPM_NAME = "libbluetooth3-5.69-1.1.aarch64.rpm"
RPM_HASH = "214fa09e076a1ef642524e2f44cee25970dbc6871d1f774647cd77f5497261d71a12ea43661147c18528cddb11ad67cb1339e1aad9418508c07fd0e7a6a9692e"

RPROVIDES:${PN} += "bluez-libs \
libbluetooth.so.3 \
libbluetooth3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

SUMMARY = "Library for USB Firewall including flex/bison parser"
DESCRIPTION = "Library to read usbauth config file into data structures"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "libusbauth-configparser1-1.0.5-1.4.aarch64.rpm"
RPM_HASH = "8b9a39e4cc8de6428c0b72d8b898b761c221089c5f2391fbb1f3f7ba34d7b6717744a67423f2763661bdb303131c46ae5108e9613fbffecd55b7670e6f0ae392"

RPROVIDES:${PN} += "libusbauth-configparser.so.1 \
libusbauth-configparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm

SUMMARY = "A protocol for redirecting USB traffic - Host-side library"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.0"

RPM_NAME = "libusbredirhost1-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "0479a3104dd1a0425f13daa8dcd86f308e8d6142672629147380390cbd8bd6a155827f744cfa275af86de8bc3f3c53920d7370d09d2da2c68dbecdc540419403"

RPROVIDES:${PN} += "libusbredirhost.so.1()(64bit) \
libusbredirhost.so.1(USBREDIRHOST_0.8.0)(64bit) \
libusbredirhost1 \
libusbredirhost1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libusb-1.0.so.0()(64bit) \
libusbredirparser.so.1()(64bit) \
libusbredirparser.so.1(USBREDIRPARSER_0.11.0)(64bit) \
libusbredirparser.so.1(USBREDIRPARSER_0.8.0)(64bit)"

inherit rpm

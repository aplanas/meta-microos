SUMMARY = "A protocol for redirecting USB traffic"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.0"

RPM_NAME = "usbredir-0.13.0-1.5.aarch64.rpm"
RPM_HASH = "eeddf9c37a9b6e5d5eb9218f5a711556e35e92fb9872e8f555fff855b0e46d3c1155d93835ed130f788a40c3f702df17a5ba4e05ca271ec7f91a823dc7e33240"

RPROVIDES:${PN} += "usbredir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libusb-1.0.so.0 \
libusbredirhost.so.1"

inherit rpm

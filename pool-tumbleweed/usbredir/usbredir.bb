SUMMARY = "A protocol for redirecting USB traffic"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.0"

RPM_NAME = "usbredir-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "452f65b58046b388f6587df19fcb9929679b26edf06cf3b50ff0299c85706ca9afd0ff1e7646c9b97be7e5d5fbcc2c02e1df23bd7b3352857441836548e7f133"

RPROVIDES:${PN} += "usbredir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libusb-1.0.so.0 \
libusbredirhost.so.1"

inherit rpm

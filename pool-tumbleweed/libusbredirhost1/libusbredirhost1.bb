SUMMARY = "A protocol for redirecting USB traffic - Host-side library"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.0"

RPM_NAME = "libusbredirhost1-0.13.0-1.5.aarch64.rpm"
RPM_HASH = "a69a095de9318d3ea7899d815f9a5aefe701699e3df0ab290689ecee460907d0561ba424affca5b5a381a6b4ddf3310248356e1ca3e5bd0c940936935b3c04f3"

RPROVIDES:${PN} += "libusbredirhost.so.1 \
libusbredirhost1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
libusbredirparser.so.1"

inherit rpm

SUMMARY = "A protocol for redirecting USB traffic - Client-side library"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.0"

RPM_NAME = "libusbredirparser1-0.13.0-1.5.aarch64.rpm"
RPM_HASH = "88335b52445aa2f3dbc7a39426c25c350d9b5224e005dea3edd2639d04963adc71f66fc076b126023e7374000cb7eb6d80a237b7c2373563e5adacac439f2e65"

RPROVIDES:${PN} += "libusbredirparser.so.1 \
libusbredirparser0 \
libusbredirparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

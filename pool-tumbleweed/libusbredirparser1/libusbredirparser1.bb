SUMMARY = "A protocol for redirecting USB traffic - Client-side library"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.0"

RPM_NAME = "libusbredirparser1-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "63b0ae875d6f69a71ffe47131b0495364840e0f3ac99bf5ed580010451d204e38e61451ae98fd1a764f140948201c3518480bdf80f9755a8496f2d0fa913e349"

RPROVIDES:${PN} += "libusbredirparser.so.1()(64bit) \
libusbredirparser.so.1(USBREDIRPARSER_0.10.0)(64bit) \
libusbredirparser.so.1(USBREDIRPARSER_0.11.0)(64bit) \
libusbredirparser.so.1(USBREDIRPARSER_0.8.0)(64bit) \
libusbredirparser0 \
libusbredirparser1 \
libusbredirparser1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

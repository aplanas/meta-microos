SUMMARY = "A protocol for redirecting USB traffic - Development files"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.0"

RPM_NAME = "usbredir-devel-0.13.0-1.5.aarch64.rpm"
RPM_HASH = "62a0a52fab0036cee41bcfb3208b74933ac770308785f7c2707084bc5ebb98738e7cf4c842c0add66fa26d6f3e0827f303d047e99f32cb93defcbc87c9f8afa2"

RPROVIDES:${PN} += "pkgconfig-libusbredirhost \
pkgconfig-libusbredirparser-0.5 \
usbredir-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbredirhost1 \
libusbredirparser1 \
pkgconfig-libusb-1.0 \
pkgconfig-libusbredirparser-0.5"

inherit rpm

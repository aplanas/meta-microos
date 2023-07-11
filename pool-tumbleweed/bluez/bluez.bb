SUMMARY = "Bluetooth Stack for Linux"
DESCRIPTION = "BlueZ provides support for the core Bluetooth layers and protocols."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-5.66-1.8.aarch64.rpm"
RPM_HASH = "9448ff3d9cc6979360a445e5ce0bb67c0b10bce9505745be8143ea9f753f73d9b77f0ce74fabe28e863b10b859193f1dfe0177c762096fd920c6e434560af2cb"

RPROVIDES:${PN} += "bluez \
bluez-audio \
bluez-hcidump \
bluez-utils \
obexd-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdbus-1.so.3 \
libell.so.0 \
libglib-2.0.so.0 \
libjson-c.so.5 \
libreadline.so.8 \
libudev.so.1 \
systemd"

inherit rpm

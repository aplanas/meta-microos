SUMMARY = "Bluetooth Stack for Linux"
DESCRIPTION = "BlueZ provides support for the core Bluetooth layers and protocols."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-5.66-1.6.aarch64.rpm"
RPM_HASH = "0a857a490668254d3c3e2d3efc4acdd997bf8a7c58993b65e188f0d6ec694bab2e33f315ea8949dddf7d8e73ef69b5cc5e77e4abd01b8b95c95fe497c1120966"

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

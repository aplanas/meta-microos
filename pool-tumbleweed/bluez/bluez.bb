SUMMARY = "Bluetooth Stack for Linux"
DESCRIPTION = "BlueZ provides support for the core Bluetooth layers and protocols."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-5.68-4.1.aarch64.rpm"
RPM_HASH = "bdd90ac46b75b7f75cf3bbca7cce4fc7782ccf3dde5473fb23163c338a5509c1d332a847ab47102fba5995be3cecd5b3176e6f27daa6571acb312cc56929dc61"

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

SUMMARY = "Bluetooth Stack for Linux"
DESCRIPTION = "BlueZ provides support for the core Bluetooth layers and protocols."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "bluez-5.69-1.1.aarch64.rpm"
RPM_HASH = "7b31c5fd8ec17c1fa1b6d21297910ee3a73793202a7fc5fc0c166e013ada8b1f83c3554443d97de4c4e245e52685b261b06470a174d86cdfa324c1e64b23321c"

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

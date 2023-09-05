SUMMARY = "Bluetooth Stack for Linux"
DESCRIPTION = "BlueZ provides support for the core Bluetooth layers and protocols."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-5.68-4.2.aarch64.rpm"
RPM_HASH = "966e1dac5d228d40aaf2c5850d110d18a83a271dd67ba6b46a4d1debdcee0c1da6d126552fb3897d491a4820ea78c6db20a82c86378d08c226a242f937ff7fdc"

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

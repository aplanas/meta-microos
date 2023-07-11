SUMMARY = "USB firewall against BadUSB attacks"
DESCRIPTION = "It is a firewall against BadUSB attacks. \
A config file describes in which way devices would be accepted."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "usbauth-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "b2cea459f891d02df4bcb93a72488ffc1011cb7fefdd5d83896e1b7d89e9284435936ef0d4cf08721953392d39a4034b50fc6ce30ff09c9461b78c741f3e9b56"

RPROVIDES:${PN} += "config-usbauth \
usbauth"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libudev.so.1 \
libusbauth-configparser.so.1 \
systemd \
udev"

inherit rpm

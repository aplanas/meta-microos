SUMMARY = "USB firewall against BadUSB attacks"
DESCRIPTION = "It is a firewall against BadUSB attacks. \
A config file describes in which way devices would be accepted."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "usbauth-1.0.5-1.2.aarch64.rpm"
RPM_HASH = "c4d86332e501ce73e911b9f564de0ca11230acfefbe0002389a30d5afc4440710754291ccc782fc1f55641882144376db1866c24e1547e4dc28210e796e2b882"

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

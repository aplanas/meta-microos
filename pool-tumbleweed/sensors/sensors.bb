SUMMARY = "Hardware health monitoring for Linux"
DESCRIPTION = "This package includes programs that show data from some sensor chips. \
The interface /proc/bus/i2c/ is provided by loading kernel modules. \
Which modules to load can be interactively detected as root by calling \
/usr/sbin/sensors-detect. Warning, before using the sensors the default \
configuration in /etc/sensors.conf has to be checked and changed to fit \
the actual set up of the mainboard and the BIOS used on that specific \
mainboard!"
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "sensors-3.6.0-8.8.aarch64.rpm"
RPM_HASH = "d61910e4a8e0751b8b4b8b36c7f553f80a023c209d26f4df87046b60d1905663bc1635e0c2f8b91c04799dc62af64fe28d371865d819cb5a3f0367faee474f0d"

RPROVIDES:${PN} += "sensors"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsensors.so.4 \
modutils \
systemd"

inherit rpm

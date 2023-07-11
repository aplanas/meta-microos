SUMMARY = "Network configuration infrastructure"
DESCRIPTION = "Wicked is a network configuration infrastructure incorporating a number \
of existing frameworks into a unified architecture, providing a DBUS \
interface to network configuration."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.73"

RPM_NAME = "wicked-0.6.73-2.1.aarch64.rpm"
RPM_HASH = "b86288be1ad77529cec3354644ca1fc27926e798db378f0d821bb88a9939ec3d2f7a69403f5fd336617f1a1dd1b3f937917b5e2aacc75d77ad9968938992f9b6"

RPROVIDES:${PN} += "config-wicked \
libwicked-0-6 \
libwicked-0.6.73.so \
wicked"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcrypt.so.20 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libsystemd.so.0 \
sysconfig-netconfig \
systemd \
util-linux-systemd \
wicked-service"

inherit rpm

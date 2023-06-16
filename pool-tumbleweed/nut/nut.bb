SUMMARY = "Network UPS Tools Core (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Core package of Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-2.8.0-2.1.aarch64.rpm"
RPM_HASH = "21f0659fb2e205f2f3f697dc57566fd6ea870734778efa75699325ef1e76f35109a4ba0fb12e833f0c574f464af97e943dd0cf9fd60a0c0e657f5a4633115d47"

RPROVIDES:${PN} += "config-nut \
nut \
nut-classic"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libi2c.so.0 \
libm.so.6 \
libmodbus.so.5 \
libnutscan.so.2 \
libpowerman.so.0 \
libssl.so.3 \
libupsclient.so.6 \
libusb-1.0.so.0 \
logrotate \
systemd \
udev \
usbutils \
user-upsd"

inherit rpm

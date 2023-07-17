SUMMARY = "Network UPS Tools Core (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Core package of Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-2.8.0-4.1.aarch64.rpm"
RPM_HASH = "aab7b0a9ded0e988e2841b488e66661cb7d784a5b4361774c0413c174f07b8ace281b2839d700576b64ba7ce3808210367a5ec0c1a7596a25daffb9cd757499b"

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

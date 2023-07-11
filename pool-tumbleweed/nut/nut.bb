SUMMARY = "Network UPS Tools Core (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Core package of Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-2.8.0-3.1.aarch64.rpm"
RPM_HASH = "fe9a10e8d0dc024975bb850a80f1a648b7feaff6ae08310047dabc329a1ab5982d8f203eaebbef991026831ffb4bd6f3e861d45326b20a51cfa71410fb2fbba3"

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

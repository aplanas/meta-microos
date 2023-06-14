SUMMARY = "Device Mapper Tools"
DESCRIPTION = "Programs and man pages for configuring and using the device mapper."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "device-mapper-2.03.16_1.02.185-6.3.aarch64.rpm"
RPM_HASH = "e08f4280464d8ded2eb481c32d463c091570cba0d8e08dd5986588656286a210593f04431863ac9dcb4d361f32a1fff35564f00f225b493ca29fda97fad579ec"

RPROVIDES:${PN} += "device-mapper"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libdevmapper.so.1.03 \
thin-provisioning-tools"

inherit rpm

SUMMARY = "Device Mapper Tools"
DESCRIPTION = "Programs and man pages for configuring and using the device mapper."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "device-mapper-2.03.16_1.02.185-7.1.aarch64.rpm"
RPM_HASH = "a9ef662a10cecd722b7984c74fe981286f1c0d2cec80f8c5307152d11b5ca613eabf2b3ecf29b7c198c3aaad06b2bd27bf6a7c82dfca4f51f6d0bd63c1df7837"

RPROVIDES:${PN} += "device-mapper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libdevmapper.so.1.03 \
thin-provisioning-tools"

inherit rpm

SUMMARY = "Device Mapper Tools"
DESCRIPTION = "Programs and man pages for configuring and using the device mapper."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "device-mapper-2.03.16_1.02.185-6.3.aarch64.rpm"
RPM_HASH = "e08f4280464d8ded2eb481c32d463c091570cba0d8e08dd5986588656286a210593f04431863ac9dcb4d361f32a1fff35564f00f225b493ca29fda97fad579ec"

RPROVIDES:${PN} += "device-mapper \
device-mapper(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdevmapper-event.so.1.03()(64bit) \
libdevmapper-event.so.1.03(Base)(64bit) \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libdevmapper.so.1.03(DM_1_02_103)(64bit) \
libdevmapper.so.1.03(DM_1_02_104)(64bit) \
libdevmapper.so.1.03(DM_1_02_105)(64bit) \
libdevmapper.so.1.03(DM_1_02_106)(64bit) \
libdevmapper.so.1.03(DM_1_02_107)(64bit) \
libdevmapper.so.1.03(DM_1_02_110)(64bit) \
libdevmapper.so.1.03(DM_1_02_129)(64bit) \
libdevmapper.so.1.03(DM_1_02_131)(64bit) \
libdevmapper.so.1.03(DM_1_02_138)(64bit) \
libdevmapper.so.1.03(DM_1_02_181)(64bit) \
libdevmapper.so.1.03(DM_1_02_97)(64bit) \
libdevmapper.so.1.03(DM_1_02_98)(64bit) \
thin-provisioning-tools"

inherit rpm

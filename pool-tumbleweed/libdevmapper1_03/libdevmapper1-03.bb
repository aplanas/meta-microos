SUMMARY = "Library for device-mapper"
DESCRIPTION = "Device mapper main shared library"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16_1.02.185"

RPM_NAME = "libdevmapper1_03-2.03.16_1.02.185-6.3.aarch64.rpm"
RPM_HASH = "6f23ec53d799416cbaf73dabcbede8ea4a15b714082be36ab6b33eb94c60ddf8809f52be064a48d6e9cec65b24239782c461a6718ba8a65f6cfb450ada60f367"

RPROVIDES:${PN} += "libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
libdevmapper.so.1.03(DM_1_02_100)(64bit) \
libdevmapper.so.1.03(DM_1_02_101)(64bit) \
libdevmapper.so.1.03(DM_1_02_103)(64bit) \
libdevmapper.so.1.03(DM_1_02_104)(64bit) \
libdevmapper.so.1.03(DM_1_02_105)(64bit) \
libdevmapper.so.1.03(DM_1_02_106)(64bit) \
libdevmapper.so.1.03(DM_1_02_107)(64bit) \
libdevmapper.so.1.03(DM_1_02_110)(64bit) \
libdevmapper.so.1.03(DM_1_02_113)(64bit) \
libdevmapper.so.1.03(DM_1_02_124)(64bit) \
libdevmapper.so.1.03(DM_1_02_128)(64bit) \
libdevmapper.so.1.03(DM_1_02_129)(64bit) \
libdevmapper.so.1.03(DM_1_02_131)(64bit) \
libdevmapper.so.1.03(DM_1_02_133)(64bit) \
libdevmapper.so.1.03(DM_1_02_135)(64bit) \
libdevmapper.so.1.03(DM_1_02_138)(64bit) \
libdevmapper.so.1.03(DM_1_02_141)(64bit) \
libdevmapper.so.1.03(DM_1_02_147)(64bit) \
libdevmapper.so.1.03(DM_1_02_172)(64bit) \
libdevmapper.so.1.03(DM_1_02_181)(64bit) \
libdevmapper.so.1.03(DM_1_02_97)(64bit) \
libdevmapper.so.1.03(DM_1_02_98)(64bit) \
libdevmapper.so.1.03(DM_1_02_99)(64bit) \
libdevmapper1_03 \
libdevmapper1_03(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libselinux.so.1()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm

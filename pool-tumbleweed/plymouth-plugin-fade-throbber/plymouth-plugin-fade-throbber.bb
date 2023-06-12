SUMMARY = "Plymouth 'Fade-Throbber' plugin"
DESCRIPTION = "This package contains the 'Fade-In' boot splash plugin for \
Plymouth. It features a centered image that fades in and out \
while other images pulsate around during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-fade-throbber-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "3c15d34e0ebbb508153c5d7770d7e096f0755f3984580fc8a3128f0ab428258abbd6c5e26538f1bc4d9d2424df2814df84a1a2bc94c6a88b393daaeac60a62e3"

RPROVIDES:${PN} += "plymouth-plugin-fade-throbber \
plymouth-plugin-fade-throbber(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libply-splash-core.so.5()(64bit) \
libply-splash-core5 \
libply-splash-graphics.so.5()(64bit) \
libply-splash-graphics5 \
libply.so.5()(64bit) \
libply5"

inherit rpm

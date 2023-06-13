SUMMARY = "Clock gadget for Elementary OS"
DESCRIPTION = "A clock application that is designed to fit perfectly into \
Elementary's design scheme."
LICENSE = "GPL-3.0-only"

PV = "2.0.2"

RPM_NAME = "hourglass-2.0.2-1.10.aarch64.rpm"
RPM_HASH = "4cd62d7d4f018770d177421ba8a55c96a7df7c247b027a5e47fd9bc004d8170dfc8565dc6de8eba761bf9d265861c2f66e3e874fd3c78c8fff9c60c1b04c6526"

RPROVIDES:${PN} += "application() \
application(com.github.sgpthomas.hourglass.desktop) \
hourglass \
hourglass(aarch-64) \
metainfo() \
metainfo(com.github.sgpthomas.hourglass.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit)"

inherit rpm

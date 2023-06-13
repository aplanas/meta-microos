SUMMARY = "Program to show the weather forecast of the next hours and days"
DESCRIPTION = "A program which displays current weather, with information about temperature, \
pressure, wind speed and direction, as well as sunrise and sunset times."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.9.1"

RPM_NAME = "meteo-0.9.9.1-1.10.aarch64.rpm"
RPM_HASH = "3e2296453c088f99bac7b3af5adbbb19af306065927f3850229cf819276c77e0071821dca4f05371a8072ce1551a2d1d49bd7928137b3533debb8a32d9f8db80"

RPROVIDES:${PN} += "application() \
application(com.gitlab.bitseater.meteo.desktop) \
metainfo() \
metainfo(com.gitlab.bitseater.meteo.appdata.xml) \
meteo \
meteo(aarch-64) \
weather"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libappindicator3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libsoup-2.4.so.1()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit)"

inherit rpm

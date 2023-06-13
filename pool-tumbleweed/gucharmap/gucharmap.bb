SUMMARY = "A Featureful Unicode Character Map"
DESCRIPTION = "Gucharmap is a featureful unicode character map."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "15.0.4"

RPM_NAME = "gucharmap-15.0.4-1.1.aarch64.rpm"
RPM_HASH = "44f78d2b7fb5c0835b5ffae71848b4104b9d42ad91a53584a9cb1ca43aa36d75afb7ad63d4c24294e7c6690d44408dabe081e8ef284d71419ed0f5a182601a23"

RPROVIDES:${PN} += "application() \
application(gucharmap.desktop) \
gucharmap \
gucharmap(aarch-64) \
metainfo() \
metainfo(gucharmap.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgucharmap_2_90.so.7()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm

SUMMARY = "The GNU Image Manipulation Program - UI Libraries"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting. \
 \
This package provides GIMP UI libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "libgimpui-2_0-0-2.10.34-4.1.aarch64.rpm"
RPM_HASH = "929378dcc679fb3701336077ea5e7bd57d811738820dba636dbaa15ea1f30023978a7f0a4b5742618ab218f01e3f87adc3a0d9083fe32e0b50acaa59710251d7"

RPROVIDES:${PN} += "libgimpthumb-2.0.so.0()(64bit) \
libgimpui-2.0.so.0()(64bit) \
libgimpui-2_0-0 \
libgimpui-2_0-0(aarch-64) \
libgimpwidgets-2.0.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbabl-0.1.so.0()(64bit) \
libbabl-0.1.so.0(V0_1_0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgegl-0.4.so.0()(64bit) \
libgexiv2.so.2()(64bit) \
libgimp-2.0.so.0()(64bit) \
libgimpbase-2.0.so.0()(64bit) \
libgimpcolor-2.0.so.0()(64bit) \
libgimpconfig-2.0.so.0()(64bit) \
libgimpmodule-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm

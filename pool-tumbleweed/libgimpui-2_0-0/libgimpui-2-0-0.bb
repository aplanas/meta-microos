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

RPROVIDES:${PN} += "libgimpthumb-2.0.so.0 \
libgimpui-2-0-0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgegl-0.4.so.0 \
libgexiv2.so.2 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpcolor-2.0.so.0 \
libgimpconfig-2.0.so.0 \
libgimpmodule-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm

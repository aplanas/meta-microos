SUMMARY = "The GNU Image Manipulation Program - Libraries"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting. \
 \
This package provides GIMP libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "libgimp-2_0-0-2.10.34-4.1.aarch64.rpm"
RPM_HASH = "afd1989fa901a254e61d70f4f087baf3c1261b08f1eaf9a21a70af0f877e9b6b19bb305c71f4a1ea55ef2d6c45e896885c9563125625af65c94e05d47ffabbd3"

RPROVIDES:${PN} += "libgimp-2.0.so.0()(64bit) \
libgimp-2_0-0 \
libgimp-2_0-0(aarch-64) \
libgimpbase-2.0.so.0()(64bit) \
libgimpcolor-2.0.so.0()(64bit) \
libgimpconfig-2.0.so.0()(64bit) \
libgimpmath-2.0.so.0()(64bit) \
libgimpmodule-2.0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbabl-0.1.so.0()(64bit) \
libbabl-0.1.so.0(V0_1_0)(64bit) \
libbabl-0_1-0 \
libc.so.6(GLIBC_2.33)(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgegl-0.4.so.0()(64bit) \
libgegl-0_4-0 \
libgexiv2.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

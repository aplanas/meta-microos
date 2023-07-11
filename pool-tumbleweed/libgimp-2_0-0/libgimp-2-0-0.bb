SUMMARY = "The GNU Image Manipulation Program - Libraries"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting. \
 \
This package provides GIMP libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "libgimp-2_0-0-2.10.34-5.1.aarch64.rpm"
RPM_HASH = "1e90c3853dd51317b495a220b7c6a6c7eddc68f375c100680e4a06b57c2df39b93a5cac4dbb0138a4c4eddfd5dc097a7f1497b90d84539891c814656a13dc395"

RPROVIDES:${PN} += "libgimp-2-0-0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpcolor-2.0.so.0 \
libgimpconfig-2.0.so.0 \
libgimpmath-2.0.so.0 \
libgimpmodule-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbabl-0-1-0 \
libbabl-0.1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgegl-0-4-0 \
libgegl-0.4.so.0 \
libgexiv2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
liblcms2.so.2 \
libm.so.6"

inherit rpm

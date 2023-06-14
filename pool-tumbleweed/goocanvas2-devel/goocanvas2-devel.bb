SUMMARY = "Development files for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgoocanvas."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "goocanvas2-devel-2.0.4-2.9.aarch64.rpm"
RPM_HASH = "97359ec7ccad7ec483860c78b240a7407dcee3a2cde3c7cdafa9cfecde1ed537257a50110141fa347a94d23ac375fce773a0581de9657498fdb7d46ca8f23bfd"

RPROVIDES:${PN} += "goocanvas2-devel \
pkgconfig-goocanvas-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoocanvas-2-0-9 \
pkgconfig-cairo \
pkgconfig-gtk+-3.0 \
typelib-1-0-GooCanvas-2-0"

inherit rpm

SUMMARY = "Development files for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgoocanvas."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "goocanvas2-devel-2.0.4-2.10.aarch64.rpm"
RPM_HASH = "8ebc7fec6818b66ba58b6c40b186549d11c2205325df6a5d20ae12ceaf4e7415213e116faae7a7425e5fa61142cfb87834cee849f234db3e16b0b6a6a32aa7eb"

RPROVIDES:${PN} += "goocanvas2-devel \
pkgconfig-goocanvas-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoocanvas-2-0-9 \
pkgconfig-cairo \
pkgconfig-gtk+-3.0 \
typelib-1-0-GooCanvas-2-0"

inherit rpm

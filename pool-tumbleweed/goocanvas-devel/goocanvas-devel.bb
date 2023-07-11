SUMMARY = "Development files for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgoocanvas."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "goocanvas-devel-3.0.0-2.10.aarch64.rpm"
RPM_HASH = "e544a6753f9530e83394cd5dda498a0b97306e16cafd327b41fd35c020fdf0d823415962b73caf3009f6def302b9e671a8c5607e18354823d637db72b718088c"

RPROVIDES:${PN} += "goocanvas-devel \
pkgconfig-goocanvas-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoocanvas-3-0-9 \
pkgconfig-cairo \
pkgconfig-gtk+-3.0 \
typelib-1-0-GooCanvas-3-0"

inherit rpm

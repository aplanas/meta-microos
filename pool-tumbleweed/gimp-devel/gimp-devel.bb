SUMMARY = "The GNU Image Manipulation Program"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the GIMP libraries."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "gimp-devel-2.10.34-5.1.aarch64.rpm"
RPM_HASH = "f26887338ef829f548a2a717de18bd5e5cca89c79166eaa49080958834278f4866808e94b434d818eb4bbf5f08b7eadc85b3a8dc1d540c0abaa035a38f65f179"

RPROVIDES:${PN} += "gimp-2.0-devel \
gimp-devel \
gimp-doc \
pkgconfig-gimp-2.0 \
pkgconfig-gimpthumb-2.0 \
pkgconfig-gimpui-2.0 \
rpm-macro-gimp-abi-version \
rpm-macro-gimp-api-version"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgimp-2-0-0 \
libgimpbase-2.0.so.0 \
libgimpui-2-0-0 \
libglib-2.0.so.0 \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gegl-0.4 \
pkgconfig-gimp-2.0 \
pkgconfig-gtk+-2.0"

inherit rpm

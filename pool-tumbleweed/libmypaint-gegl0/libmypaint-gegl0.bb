SUMMARY = "GEGL bindings for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes which is \
used by MyPaint and other projects. This package provides the shared libraries \
for libmypaint's GEGL bindings."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-gegl0-1.6.1-2.4.aarch64.rpm"
RPM_HASH = "4aacb3802d9fcc430eaba42496b4e48e10175141fcc8219efe4b8521abd4509705c26bc3dc915034daec2f7a11d33837f119bbb00945c29d880e1a7e28a276f5"

RPROVIDES:${PN} += "libmypaint-gegl.so.0 \
libmypaint-gegl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgegl-0.4.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmypaint.so.0"

inherit rpm

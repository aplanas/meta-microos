SUMMARY = "GEGL bindings for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes which is \
used by MyPaint and other projects. This package provides the shared libraries \
for libmypaint's GEGL bindings."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-gegl0-1.6.1-2.3.aarch64.rpm"
RPM_HASH = "ab9d23cc38c03804eb9c035027684fd666f332639b2bcfade50fba4bd71c9bacc546edcd9f85a9f136f20b9d6d3c6174ca1653b5b14bb0783d9ffc5cffc11978"

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

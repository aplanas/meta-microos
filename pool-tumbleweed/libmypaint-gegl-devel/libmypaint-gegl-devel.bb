SUMMARY = "Header files for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes which \
is used by MyPaint and other projects. This package provides the header \
files needed for developing applications using the gegl bindings for libmypaint."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-gegl-devel-1.6.1-2.4.aarch64.rpm"
RPM_HASH = "504524905a7098684544d17f6c011caf4bf6b3503582148694b7b739d40155d73881720e33fedc1961cfd6ffecf45572d6664a6a8de2c049728f55a7836f4117"

RPROVIDES:${PN} += "libmypaint-gegl-devel \
pkgconfig-libmypaint-gegl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmypaint-gegl0 \
libmypaint0 \
pkgconfig-gegl-0.4 \
pkgconfig-libmypaint"

inherit rpm

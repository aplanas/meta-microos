SUMMARY = "A brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes \
which is used by MyPaint and other projects including GIMP 2.9+. \
This package provides the shared libraries for libmypaint."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint0-1.6.1-2.4.aarch64.rpm"
RPM_HASH = "452fe3c3aecc074fa2df0934801688d1a9aaf78ed003035373a8c35e110439bc43693716178cca7ae1d69f3b1da7d8941e75f842ac95fd3c1205b06cfb786081"

RPROVIDES:${PN} += "libmypaint \
libmypaint.so.0 \
libmypaint0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libjson-c.so.5 \
libm.so.6"

inherit rpm

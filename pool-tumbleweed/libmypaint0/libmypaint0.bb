SUMMARY = "A brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes \
which is used by MyPaint and other projects including GIMP 2.9+. \
This package provides the shared libraries for libmypaint."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint0-1.6.1-2.3.aarch64.rpm"
RPM_HASH = "c92b0e56e91e475325f7601c8960cd8ff634a5ca44708bebc93c72d63f17dd3577526d0abca4ba2abd6fe1670e67ec77e548031d74abab957e9ba6c3f0dc0ad3"

RPROVIDES:${PN} += "libmypaint \
libmypaint.so.0()(64bit) \
libmypaint0 \
libmypaint0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libjson-c.so.5()(64bit) \
libm.so.6()(64bit)"

inherit rpm

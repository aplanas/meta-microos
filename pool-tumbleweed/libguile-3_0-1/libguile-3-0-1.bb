SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains the shared libraries."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "libguile-3_0-1-3.0.9-1.1.aarch64.rpm"
RPM_HASH = "a25ac1ed027d46f0ab00c93a624351a6751f71ef15290e29a5f72498855c39d915ef81941ae781acaf0d44fcdf0347da315d121089218cbc53156d115a39f201"

RPROVIDES:${PN} += "libguile-3-0-1 \
libguile-3.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
glibc-locale \
guile-modules-3-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libffi.so.8 \
libgc.so.1 \
libgmp.so.10 \
libm.so.6 \
libunistring.so.5"

inherit rpm

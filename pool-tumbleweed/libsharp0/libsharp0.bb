SUMMARY = "Shared library for libsharp -- a spherical harmonic transforms library"
DESCRIPTION = "libsharp is a code library for spherical harmonic transforms (SHTs). \
 \
This package provides the shared library for libsharp."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libsharp0-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "f80d86f686f844a46aa6a4cfd1efc1f91f216fb7e6817502d8e8da12c58dd7f7be10eaeab897eb13603ab1495bd291a46b70a31e60acc986489c59096aecd4d6"

RPROVIDES:${PN} += "libsharp.so.0()(64bit) \
libsharp0 \
libsharp0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm

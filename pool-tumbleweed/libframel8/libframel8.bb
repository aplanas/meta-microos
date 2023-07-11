SUMMARY = "Shared library for framel - a library for gravitational wave frame data"
DESCRIPTION = "The Frame Library is a software in C language, with interfaces to python and \
matlab, dedicated to frame data manipulation including file input/output. \
 \
This package provides the shared library for framel."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "libframel8-8.42.3-1.6.aarch64.rpm"
RPM_HASH = "c6f694ec50fa1c05895f3c358f3334a8a6a9b0b09ecc839d1e75f9a153240561af87e1a2a1b8ec823fd51c2561ef6840ede466e29ad68c1eca8eebaaab29911a"

RPROVIDES:${PN} += "libframel.so.8 \
libframel8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

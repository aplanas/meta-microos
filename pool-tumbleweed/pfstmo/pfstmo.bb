SUMMARY = "Tone Mapping Operators for High Dynamic Range Images"
DESCRIPTION = "pfstmo package contains the implementation of tone mapping operators, \
suitable for processing of both static images and animations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstmo-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "5f72bd9a22545e41e15478d12c86f3cf80048abb65c1269c99c490ada458b6f5f2c74b619836cf97abb0df2f48c5591440fc07474c74ec72ca5aef9302611566"

RPROVIDES:${PN} += "pfstmo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm

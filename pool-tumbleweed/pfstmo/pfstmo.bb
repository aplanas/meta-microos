SUMMARY = "Tone Mapping Operators for High Dynamic Range Images"
DESCRIPTION = "pfstmo package contains the implementation of tone mapping operators, \
suitable for processing of both static images and animations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstmo-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "cfd0bb5818c7213b46d58a877f332d1898e155a85b51a12f6889f01888e1123c35e9630febffefcad0cd535da6b43ee5ccee36643dea02b1e933bd34b0ee5a4d"

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

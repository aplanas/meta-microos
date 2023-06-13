SUMMARY = "Tone Mapping Operators for High Dynamic Range Images"
DESCRIPTION = "pfstmo package contains the implementation of tone mapping operators, \
suitable for processing of both static images and animations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstmo-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "cfd0bb5818c7213b46d58a877f332d1898e155a85b51a12f6889f01888e1123c35e9630febffefcad0cd535da6b43ee5ccee36643dea02b1e933bd34b0ee5a4d"

RPROVIDES:${PN} += "pfstmo \
pfstmo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfftw3.so.3()(64bit) \
libfftw3_threads.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libpfs.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

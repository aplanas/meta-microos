SUMMARY = "Tone Mapping Operators for High Dynamic Range Images"
DESCRIPTION = "pfstmo package contains the implementation of tone mapping operators, \
suitable for processing of both static images and animations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstmo-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "b53eb552a8b391ac505983ebb955c043f49340c80530fe597a5dc0d667f2b0d6b4ee7f299dc96ac6591decd86ca55d42afd405b52e7e10d3f2f7befb0e420623"

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

SUMMARY = "Open Source Software Image Map libraries"
DESCRIPTION = "The OSSIM shared library files. \
Open Source Software Image Map (OSSIM) is an engine for \
remote sensing, image processing, geographical information systems and \
photogrammetry."
LICENSE = "LGPL-3.0-only"

PV = "2.11.1"

RPM_NAME = "libossim1-2.11.1-1.20.aarch64.rpm"
RPM_HASH = "7502a4dad2fc323109846223d00955a84692f4989f4e426828a02fe8fa29385f2cade3d3c8a72ea453877921230b8700e51e64fc06f68f1193d98a69c8ec8a19"

RPROVIDES:${PN} += "libossim.so.1 \
libossim1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgeos-c.so.1 \
libgeotiff.so.5 \
libhdf5-cpp.so.200 \
libhdf5.so.200 \
libjpeg.so.8 \
libjsoncpp.so.25 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm

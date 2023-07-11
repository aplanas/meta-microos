SUMMARY = "Open Source Software Image Map libraries"
DESCRIPTION = "The OSSIM shared library files. \
Open Source Software Image Map (OSSIM) is an engine for \
remote sensing, image processing, geographical information systems and \
photogrammetry."
LICENSE = "LGPL-3.0-only"

PV = "2.11.1"

RPM_NAME = "libossim1-2.11.1-1.21.aarch64.rpm"
RPM_HASH = "a93d05b658a8a16fa367955ab624ba06e38630830d7da121974b0ff0d665155280292d7888c91475f982db5bc7b60d6e5d073ed103ec1c568ea96d87c4a9e2c3"

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

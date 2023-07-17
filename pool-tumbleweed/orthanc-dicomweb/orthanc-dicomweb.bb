SUMMARY = "WebViewer plugin for Orthanc"
DESCRIPTION = "WebViewer plugin for Orthanc"
LICENSE = "AGPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "orthanc-dicomweb-1.14-1.1.aarch64.rpm"
RPM_HASH = "cae99c4be6a8420e1781249420dfd8bc4afaa8fbf7fa49da615d6457ce230c30e0aec71413e7ec235737560c37adfe1d113dd272bcfb7846760db9cc09171c2d"

RPROVIDES:${PN} += "libOrthancDicomWeb.so.1.14 \
orthanc-dicomweb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
orthanc"

inherit rpm

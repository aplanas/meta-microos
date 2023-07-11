SUMMARY = "WebViewer plugin for Orthanc"
DESCRIPTION = "WebViewer plugin for Orthanc"
LICENSE = "AGPL-3.0-or-later"

PV = "1.13"

RPM_NAME = "orthanc-dicomweb-1.13-1.3.aarch64.rpm"
RPM_HASH = "0bf3a0229a916c97f826ea1d244d7acde558555534cea77579ac5f09327a2f1e408c8ed65fc677c03ecc5ab6034b4bfeeaef8eba51b6379fb7547b8ba854aa40"

RPROVIDES:${PN} += "libOrthancDicomWeb.so.1.13 \
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

SUMMARY = "WebViewer plugin for Orthanc"
DESCRIPTION = "WebViewer plugin for Orthanc"
LICENSE = "AGPL-3.0-or-later"

PV = "1.15"

RPM_NAME = "orthanc-dicomweb-1.15-1.1.aarch64.rpm"
RPM_HASH = "1487cb446fd7576edaed3b76ba883d7ae5bfc748bbec8992cbab1ba3161191e98c38e4791c7547c9c1b880ebbe6538b9ffbe859dc7ab8c09174cfac9328ed5df"

RPROVIDES:${PN} += "libOrthancDicomWeb.so.1.15 \
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
libz.so.1 \
orthanc"

inherit rpm

SUMMARY = "Web Viewer plugin for Orthanc"
DESCRIPTION = "Webviewer plugin for Orthanc"
LICENSE = "AGPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "orthanc-webviewer-2.8-1.6.aarch64.rpm"
RPM_HASH = "cf4bf4663af9485d9ae8665f326e5d9d6df2ec07faf05790f3418ed21d035c9e9ccdfa3b0d0adfcbbd3f0f8d810f9282a76c0ee5755e26954d373c59e13cd3ee"

RPROVIDES:${PN} += "libOrthancWebViewer.so.2.8 \
orthanc-webviewer"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libsqlite3.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
orthanc"

inherit rpm

SUMMARY = "Web Viewer plugin for Orthanc"
DESCRIPTION = "Webviewer plugin for Orthanc"
LICENSE = "AGPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "orthanc-webviewer-2.8-1.5.aarch64.rpm"
RPM_HASH = "74cc37e2ee72ece6938f74c785d29bb7fb8c5229e32379f5df537be85b9e6d30be5a47f1dc110f7d76b2b271bf3781730b1ef67d3698f2b54cbcc71e990b818d"

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

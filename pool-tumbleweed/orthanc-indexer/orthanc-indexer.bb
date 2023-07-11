SUMMARY = "Folder plugin indexer for Orthanc"
DESCRIPTION = "Folder Indexer Plugin for Orthanc: It synchronizes automatically the \
content of Orthanc with some filesystem."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "orthanc-indexer-1.0-1.12.aarch64.rpm"
RPM_HASH = "538914a8058fcb56bd2ed25aadf9210cd382799c3bbe6d66626fca8f3e5e6fafb27346c7928becff5d27da9a0811a8a13cd3dd9edf309c09a37cc1a130c735b4"

RPROVIDES:${PN} += "libOrthancIndexer.so.1.0 \
orthanc-indexer"

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
orthanc"

inherit rpm

SUMMARY = "Folder plugin indexer for Orthanc"
DESCRIPTION = "Folder Indexer Plugin for Orthanc: It synchronizes automatically the \
content of Orthanc with some filesystem."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "orthanc-indexer-1.0-1.11.aarch64.rpm"
RPM_HASH = "042bf26a5e6e87a70ea0ef712761390aa1a91b017845387b2c1bd4c9b9224c9105dfebc04a11424ff31346a1794e25a30131432adbbac39a5a072d41a9c06daf"

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

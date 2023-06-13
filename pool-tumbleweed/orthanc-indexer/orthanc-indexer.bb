SUMMARY = "Folder plugin indexer for Orthanc"
DESCRIPTION = "Folder Indexer Plugin for Orthanc: It synchronizes automatically the \
content of Orthanc with some filesystem."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "orthanc-indexer-1.0-1.11.aarch64.rpm"
RPM_HASH = "042bf26a5e6e87a70ea0ef712761390aa1a91b017845387b2c1bd4c9b9224c9105dfebc04a11424ff31346a1794e25a30131432adbbac39a5a072d41a9c06daf"

RPROVIDES:${PN} += "libOrthancIndexer.so.1.0()(64bit) \
orthanc-indexer \
orthanc-indexer(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjsoncpp.so.25()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
orthanc"

inherit rpm

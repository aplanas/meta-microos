SUMMARY = "Web Viewer plugin for Orthanc"
DESCRIPTION = "Webviewer plugin for Orthanc"
LICENSE = "AGPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "orthanc-webviewer-2.8-1.5.aarch64.rpm"
RPM_HASH = "74cc37e2ee72ece6938f74c785d29bb7fb8c5229e32379f5df537be85b9e6d30be5a47f1dc110f7d76b2b271bf3781730b1ef67d3698f2b54cbcc71e990b818d"

RPROVIDES:${PN} += "libOrthancWebViewer.so.2.8()(64bit) \
orthanc-webviewer \
orthanc-webviewer(aarch-64)"
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
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
orthanc"

inherit rpm

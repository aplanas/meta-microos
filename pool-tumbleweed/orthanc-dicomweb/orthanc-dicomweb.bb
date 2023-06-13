SUMMARY = "WebViewer plugin for Orthanc"
DESCRIPTION = "WebViewer plugin for Orthanc"
LICENSE = "AGPL-3.0-or-later"

PV = "1.13"

RPM_NAME = "orthanc-dicomweb-1.13-1.2.aarch64.rpm"
RPM_HASH = "2f53efbb52b02c80a41edc6de9d650ada9733d8710b3a5fbc393e4f588d98b828c3177337d88f67e074e701c213b7dbd8b3f9f138f9e3d80fea89a309ed71113"

RPROVIDES:${PN} += "libOrthancDicomWeb.so.1.13()(64bit) \
orthanc-dicomweb \
orthanc-dicomweb(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_locale.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjsoncpp.so.25()(64bit) \
libm.so.6()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit) \
orthanc"

inherit rpm

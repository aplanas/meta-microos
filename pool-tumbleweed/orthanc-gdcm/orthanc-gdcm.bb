SUMMARY = "GDCM plugin for Orthanc"
DESCRIPTION = "GDCM for Orthanc"
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "orthanc-gdcm-1.5-2.5.aarch64.rpm"
RPM_HASH = "3f5c7d4de0da0035e32b7bc6ec7367794634420660fa7cc8d67f977eb94e6c0b0aea6acea7395e4914656bde030eff3eae41b63be96afe96e47a72f49f938f2b"

RPROVIDES:${PN} += "libOrthancGdcm.so.1.5()(64bit) \
orthanc-gdcm \
orthanc-gdcm(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdcmCommon.so.3.0()(64bit) \
libgdcmDSED.so.3.0()(64bit) \
libgdcmMSFF.so.3.0()(64bit) \
libjsoncpp.so.25()(64bit) \
libstdc++.so.6()(64bit) \
orthanc"

inherit rpm

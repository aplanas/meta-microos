SUMMARY = "GDCM plugin for Orthanc"
DESCRIPTION = "GDCM for Orthanc"
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "orthanc-gdcm-1.5-2.5.aarch64.rpm"
RPM_HASH = "3f5c7d4de0da0035e32b7bc6ec7367794634420660fa7cc8d67f977eb94e6c0b0aea6acea7395e4914656bde030eff3eae41b63be96afe96e47a72f49f938f2b"

RPROVIDES:${PN} += "libOrthancGdcm.so.1.5 \
orthanc-gdcm"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgdcmCommon.so.3.0 \
libgdcmDSED.so.3.0 \
libgdcmMSFF.so.3.0 \
libjsoncpp.so.25 \
libstdc++.so.6 \
orthanc"

inherit rpm

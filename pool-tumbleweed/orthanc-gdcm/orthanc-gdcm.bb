SUMMARY = "GDCM plugin for Orthanc"
DESCRIPTION = "GDCM for Orthanc"
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "orthanc-gdcm-1.5-2.6.aarch64.rpm"
RPM_HASH = "8e33a5a2c015bc13092eac13912d80dc0830d924c99abf5603aa4c1b4e3062e8739eda4fae87ed336ab7074a07e7b02e0e747113b8723734a6c1e82a716ea157"

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

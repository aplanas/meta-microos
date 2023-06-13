SUMMARY = "Android dynamic partition tools"
DESCRIPTION = "This package contains the Android dynamic partition tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.1"

RPM_NAME = "android-tools-partition-34.0.1-1.1.aarch64.rpm"
RPM_HASH = "cb0a22e0100f48fda358a98918bc135af41bbbd0c0cab054dde35300ce7281a7157cd1057b50e506b7fdbcc90e79ac68f8f21538f51f9970616cba3d5ccf93a7"

RPROVIDES:${PN} += "android-tools-partition \
android-tools-partition(aarch-64)"

RDEPENDS:${PN} += "android-tools \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm

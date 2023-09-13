SUMMARY = "Android dynamic partition tools"
DESCRIPTION = "This package contains the Android dynamic partition tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.4"

RPM_NAME = "android-tools-partition-34.0.4-1.2.aarch64.rpm"
RPM_HASH = "40376c6efd83519ea19516a02c46df2f5b4640e97b5c102d758263a1455bb7f68b1ab4dd771506e750a34bef62f3cafa0a7382653db62fc151a08fe243e5dbb0"

RPROVIDES:${PN} += "android-tools-partition"

RDEPENDS:${PN} += "android-tools \
ld-linux-aarch64.so.1 \
libabsl-status.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

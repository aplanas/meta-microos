SUMMARY = "Android dynamic partition tools"
DESCRIPTION = "This package contains the Android dynamic partition tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.1"

RPM_NAME = "android-tools-partition-34.0.1-2.1.aarch64.rpm"
RPM_HASH = "effb53f55fde6e783a4412cfd446a365363e22a2e9fa5b5bd41a303500d403f1944534eca87ebdcfc8f48d3708a39650dbc29848a36e505af58cef3bbe07ac55"

RPROVIDES:${PN} += "android-tools-partition"

RDEPENDS:${PN} += "android-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libz.so.1"

inherit rpm

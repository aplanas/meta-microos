SUMMARY = "Android platform tools"
DESCRIPTION = "Android SDK Platform-Tools is a component for the Android SDK. \
It includes tools that interface with the Android platform."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.4"

RPM_NAME = "android-tools-34.0.4-1.2.aarch64.rpm"
RPM_HASH = "d33dc056d3ea1be02e884e0a2fdd1394c6170236989100924efed2e09c2968c0f1632252de62b959abeb43b0a8b31cb2851f41435b4c1cf541a075dabe10b973"

RPROVIDES:${PN} += "android-tools \
android-tools-python3"

RDEPENDS:${PN} += "/usr/bin/python3 \
android-udev-rules \
f2fs-tools \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
libpcre2-8.so.0 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm

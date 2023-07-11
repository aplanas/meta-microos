SUMMARY = "Android platform tools"
DESCRIPTION = "Android SDK Platform-Tools is a component for the Android SDK. \
It includes tools that interface with the Android platform."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.1"

RPM_NAME = "android-tools-34.0.1-2.1.aarch64.rpm"
RPM_HASH = "be70d1c1b1568bbd7c23fe5d4a2c92119d37d7cfc4b7f09d9a97c42ad1c1a56f8287872b32f04366bc8094b950a91a4f4d77969482b662c93fe18b36f322aa17"

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
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
libzstd.so.1 \
python3"

inherit rpm

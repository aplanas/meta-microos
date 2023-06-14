SUMMARY = "Android platform tools"
DESCRIPTION = "Android SDK Platform-Tools is a component for the Android SDK. \
It includes tools that interface with the Android platform."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.1"

RPM_NAME = "android-tools-34.0.1-1.1.aarch64.rpm"
RPM_HASH = "1401190c2d62c77603fa551bce7633ec1c22636deaddb98a6000c49ac640ab863c2c3d261ba145b57d1840a29f5f84d11b8bbe7a5593456a8b373a9cb94babf2"

RPROVIDES:${PN} += "android-tools \
android-tools-python3"

RDEPENDS:${PN} += "/usr/bin/python3 \
android-udev-rules \
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

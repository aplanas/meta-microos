SUMMARY = "Android platform tools"
DESCRIPTION = "Android SDK Platform-Tools is a component for the Android SDK. \
It includes tools that interface with the Android platform."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.1"

RPM_NAME = "android-tools-34.0.1-1.1.aarch64.rpm"
RPM_HASH = "1401190c2d62c77603fa551bce7633ec1c22636deaddb98a6000c49ac640ab863c2c3d261ba145b57d1840a29f5f84d11b8bbe7a5593456a8b373a9cb94babf2"

RPROVIDES:${PN} += "android-tools \
android-tools(aarch-64) \
android-tools-python3"

RDEPENDS:${PN} += "/usr/bin/python3 \
android-udev-rules \
ld-linux-aarch64.so.1()(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblz4.so.1()(64bit) \
libpcre2-8.so.0()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
python3"

inherit rpm

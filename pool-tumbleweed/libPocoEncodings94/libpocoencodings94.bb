SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoEncodings94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "4f1e6e23323701d093d32f598912f72d4c1889ecdd7144aec6f59df0597aa46adc5637b4a8ff6eda617d039c19553d8a1cdcbb4fb7828d74113efaa674672443"

RPROVIDES:${PN} += "libPocoEncodings.so.94 \
libPocoEncodings94 \
poco-encodings"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

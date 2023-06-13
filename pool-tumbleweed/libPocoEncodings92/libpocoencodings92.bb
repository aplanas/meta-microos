SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoEncodings92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "77ece1ced37c96f1eedc9e6709a6f16298eadabcd9e09659fe05c34daeb64c3e364d948d0fafc009fe831b9870a41efa840c66327d2b4838afa084b791559bb2"

RPROVIDES:${PN} += "libPocoEncodings.so.92()(64bit) \
libPocoEncodings92 \
libPocoEncodings92(aarch-64) \
poco-encodings"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libPocoFoundation.so.92()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

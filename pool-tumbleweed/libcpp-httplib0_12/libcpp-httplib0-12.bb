SUMMARY = "A C++11 HTTP/HTTPS library"
DESCRIPTION = "This is a multi-threaded HTTP library with blocking I/O. There is no \
support for non-blocking mode."
LICENSE = "MIT"

PV = "0.12.5"

RPM_NAME = "libcpp-httplib0_12-0.12.5-1.1.aarch64.rpm"
RPM_HASH = "4441463cc9b3253af93960213fa92774c6439220efcd9c9a2180398552927536e10448aa6c75c3e4991b3f3ce4d72b3d1762e0db59cdcb1b1de6ab5492d35373"

RPROVIDES:${PN} += "libcpp-httplib.so.0.12 \
libcpp-httplib0-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

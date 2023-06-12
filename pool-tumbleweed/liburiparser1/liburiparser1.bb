SUMMARY = "A strictly RFC 3986 compliant URI parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
This package contains the shared library for uriparser."
LICENSE = "BSD-3-Clause"

PV = "0.9.7"

RPM_NAME = "liburiparser1-0.9.7-1.3.aarch64.rpm"
RPM_HASH = "90d55b9616f22345aba00deaade58ce6f96b1887fccb1582bae91c3357dc3b71a29781b241793c0afa2181a842402c7db28ba19ff80c4f23ed0172b57f6e9391"

RPROVIDES:${PN} += "liburiparser.so.1()(64bit) \
liburiparser1 \
liburiparser1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.26)(64bit)"

inherit rpm

SUMMARY = "C++ Rest library"
DESCRIPTION = "The C++ REST SDK is a Microsoft project for cloud-based client-server \
communication in native code using a modern asynchronous C++ API design. This \
project aims to help C++ developers connect to and interact with services."
LICENSE = "MIT & BSD-3-Clause & Zlib"

PV = "2.10.18"

RPM_NAME = "libcpprest2_10-2.10.18-1.14.aarch64.rpm"
RPM_HASH = "484d738f388b59c3807e26760a7d17f66794dd9db4aa91b5aefce4b93a76fa4ca71279fd5cfcbaf6e69b85a1f3b3a962cde6bab13ca2e15807ff0e8a1455ef5a"

RPROVIDES:${PN} += "libcpprest.so.2.10 \
libcpprest2-10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

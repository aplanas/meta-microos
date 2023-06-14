SUMMARY = "Runtime libraries for gSOAP"
DESCRIPTION = "gSOAP is a toolkit for C and C++ server and client Web service \
applications, and is responsible for e.g. HTTP request handling and \
the serialization of XML."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.127"

RPM_NAME = "libgsoap-2_8_127-2.8.127-1.1.aarch64.rpm"
RPM_HASH = "1e8309ed50db0ea9927e52050e0b1a8e86f9d6bcc2254363fabc21faeb91e85fc1b6a72000878fc797f875586a1f92ef8754e719a2b873ad91cf5114ff2d2361"

RPROVIDES:${PN} += "libgsoap++-2.8.127.so \
libgsoap-2-8-127 \
libgsoap-2.8.127.so \
libgsoapck++-2.8.127.so \
libgsoapck-2.8.127.so \
libgsoapssl++-2.8.127.so \
libgsoapssl-2.8.127.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

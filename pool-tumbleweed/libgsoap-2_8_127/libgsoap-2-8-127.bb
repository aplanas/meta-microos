SUMMARY = "Runtime libraries for gSOAP"
DESCRIPTION = "gSOAP is a toolkit for C and C++ server and client Web service \
applications, and is responsible for e.g. HTTP request handling and \
the serialization of XML."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.127"

RPM_NAME = "libgsoap-2_8_127-2.8.127-1.2.aarch64.rpm"
RPM_HASH = "13727629de4117372d97521de1a03794e5be078673ee0e9745e451050058279e11554a30f8d07f5cd4d0bdd9ec4c947682dacaa4a44dfef3b27cf662e0f0bb04"

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

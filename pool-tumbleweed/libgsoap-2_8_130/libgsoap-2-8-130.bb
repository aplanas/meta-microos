SUMMARY = "Runtime libraries for gSOAP"
DESCRIPTION = "gSOAP is a toolkit for C and C++ server and client Web service \
applications, and is responsible for e.g. HTTP request handling and \
the serialization of XML."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.130"

RPM_NAME = "libgsoap-2_8_130-2.8.130-1.1.aarch64.rpm"
RPM_HASH = "cf651038645e299c21c092f163beb3fbf3df03276a04aec306428d1bc7ce33e8ea0b2a4b5a740bb5b5bbfa632153f3620468a4fdee011c104608ec9813e405cb"

RPROVIDES:${PN} += "libgsoap++-2.8.130.so \
libgsoap-2-8-130 \
libgsoap-2.8.130.so \
libgsoapck++-2.8.130.so \
libgsoapck-2.8.130.so \
libgsoapssl++-2.8.130.so \
libgsoapssl-2.8.130.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

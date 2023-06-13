SUMMARY = "Simple Authentication and Security Layer (SASL) library"
DESCRIPTION = "Simple Authentication and Security Layer (SASL) is a framework for \
authentication and data security in Internet protocols. \
 \
This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "libsasl2-3-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "503bf2704121ab558a307863f15bee64a8ce777f4eed3f7e38fc4c95ec1453565531d87a702e84db767bef8e45a484606985cb27f68eafa198485958dcc3743e"

RPROVIDES:${PN} += "libsasl2-3 \
libsasl2-3(aarch-64) \
libsasl2.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

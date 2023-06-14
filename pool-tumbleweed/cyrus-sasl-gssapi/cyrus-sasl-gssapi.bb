SUMMARY = "Plugin for the GSSAPI SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-gssapi-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "6355d41a796664873b421c8b2606b354856d1490faafcfced9b6b8e9a6e6b371fcd16d190cf891f3c463105df4f1e806fc820b3d58a182649a2687f41bd564c5"

RPROVIDES:${PN} += "cyrus-sasl-gssapi \
libgssapiv2.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm

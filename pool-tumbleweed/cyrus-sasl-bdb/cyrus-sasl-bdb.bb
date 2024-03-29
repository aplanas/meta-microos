SUMMARY = "Implementation of Cyrus SASL API"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "9b2802bee11ceb1b85d4a0f7a937ed409e9e7e892f17d4f87133be3f4cd71eaf0fa0e300b0a46b131097acd3927981e86f2ec3109a37ff5b98ce0f5e6fa7074d"

RPROVIDES:${PN} += "cyrus-sasl-bdb \
libanonymous.so.3 \
liblogin.so.3 \
libsasldb.so.3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libgssapi-krb5.so.2 \
libsasl2-3 \
libsasl2.so.3"

inherit rpm

SUMMARY = "Plugin for the GS2 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-gs2-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "294ec949a0b3ae2addcf3c01f163e8cd8dbd6804f953a9f8f0426915015a7ab3aabcff1a94812871f7aa981fffbbab565ba77ba91abf286bccc33563f5522238"

RPROVIDES:${PN} += "cyrus-sasl-gs2 \
libgs2.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm

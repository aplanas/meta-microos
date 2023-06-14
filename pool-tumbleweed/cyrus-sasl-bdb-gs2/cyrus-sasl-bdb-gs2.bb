SUMMARY = "Plugin for the GS2 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-gs2-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "a2fbcf8ba5ff76d5681e7668dd1cf1fa6b06bef9046a411776a371fffac8cda678695692fede2f25dc2ab663f0dcab29449ed2fb9cab05f57445872bae7fbce4"

RPROVIDES:${PN} += "cyrus-sasl-bdb-gs2 \
libgs2.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm

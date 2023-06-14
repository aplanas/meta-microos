SUMMARY = "Plugin for the GSSAPI SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-gssapi-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "08ab161d7bffcc0adb19dd946ed5ae77d79bb29259fa055ba98ed84b0f56ff967805728158844c11005ab40df83090b6b3be370548dc5d20e119e7d9dc24eb41"

RPROVIDES:${PN} += "cyrus-sasl-bdb-gssapi \
libgssapiv2.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm

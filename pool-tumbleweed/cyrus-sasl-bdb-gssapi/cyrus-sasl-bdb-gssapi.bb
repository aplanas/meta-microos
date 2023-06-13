SUMMARY = "Plugin for the GSSAPI SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-gssapi-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "08ab161d7bffcc0adb19dd946ed5ae77d79bb29259fa055ba98ed84b0f56ff967805728158844c11005ab40df83090b6b3be370548dc5d20e119e7d9dc24eb41"

RPROVIDES:${PN} += "cyrus-sasl-bdb-gssapi \
cyrus-sasl-bdb-gssapi(aarch-64) \
libgssapiv2.so.3()(64bit)"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit)"

inherit rpm

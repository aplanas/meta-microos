SUMMARY = "Library for transferring data from URLs"
DESCRIPTION = "The cURL shared library for accessing data using different \
network protocols."
LICENSE = "curl"

PV = "8.1.2"

RPM_NAME = "libcurl4-8.1.2-1.1.aarch64.rpm"
RPM_HASH = "4f1480e96020f5d7af4936a913f97dbfead6c53800f70778ee1647f1561fafc673e5869ee5a45ec093576713abac97c2509b38ac56de4bc7ac7d6da9df572f53"

RPROVIDES:${PN} += "libcurl.so.4 \
libcurl4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
liblber.so.2 \
libldap.so.2 \
libnghttp2.so.14 \
libpsl.so.5 \
libssh.so.4 \
libssl.so.3 \
libz.so.1 \
libzstd.so.1"

inherit rpm

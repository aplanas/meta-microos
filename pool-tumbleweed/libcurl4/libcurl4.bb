SUMMARY = "Library for transferring data from URLs"
DESCRIPTION = "The cURL shared library for accessing data using different \
network protocols."
LICENSE = "curl"

PV = "8.2.1"

RPM_NAME = "libcurl4-8.2.1-1.1.aarch64.rpm"
RPM_HASH = "35e83cff6943787858768dbedc4cf488e231be7293285141f0bec907d4c1acf287f083bce2df3d1d9c8548c1ae9870d1c0a8f126f96dd8b0c7a744096a49b45c"

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

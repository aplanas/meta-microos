SUMMARY = "An HTTP and WebDAV Client Library"
DESCRIPTION = "neon is an HTTP and WebDAV client library with a C interface."
LICENSE = "GPL-2.0-or-later"

PV = "0.32.5"

RPM_NAME = "libneon27-0.32.5-1.5.aarch64.rpm"
RPM_HASH = "d195bb0e8b8c7ca53c4c30866e490a1f65c15b3709fa836bad56e6c13c55434eb747969896d4449278f8e86bb6d53c3cc6ed883b8ae6d9613b60a1d291611c5c"

RPROVIDES:${PN} += "libneon.so.27 \
libneon27 \
neon"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libgssapi-krb5.so.2 \
libproxy.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm

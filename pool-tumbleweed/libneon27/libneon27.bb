SUMMARY = "An HTTP and WebDAV Client Library"
DESCRIPTION = "neon is an HTTP and WebDAV client library with a C interface."
LICENSE = "GPL-2.0-or-later"

PV = "0.32.5"

RPM_NAME = "libneon27-0.32.5-1.4.aarch64.rpm"
RPM_HASH = "299f419f3156c7a3aa51c158eba8ca72f85d601b24c1118c7ff76109c51a5e766fe334ca4c9a1f30d46c443b3cb3504f5864979742a872341caf8e3dc462f333"

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

SUMMARY = "An HTTP and WebDAV Client Library"
DESCRIPTION = "neon is an HTTP and WebDAV client library with a C interface."
LICENSE = "GPL-2.0-or-later"

PV = "0.32.5"

RPM_NAME = "libneon27-0.32.5-1.4.aarch64.rpm"
RPM_HASH = "299f419f3156c7a3aa51c158eba8ca72f85d601b24c1118c7ff76109c51a5e766fe334ca4c9a1f30d46c443b3cb3504f5864979742a872341caf8e3dc462f333"

RPROVIDES:${PN} += "libneon.so.27()(64bit) \
libneon.so.27(NEON_0_29)(64bit) \
libneon.so.27(NEON_0_30)(64bit) \
libneon.so.27(NEON_0_31)(64bit) \
libneon.so.27(NEON_0_32)(64bit) \
libneon27 \
libneon27(aarch-64) \
neon"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libexpat.so.1()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libproxy.so.1()(64bit) \
libproxy.so.1(LIBPROXY_0.4.16)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm

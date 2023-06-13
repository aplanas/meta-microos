SUMMARY = "Small embeddable http server library"
DESCRIPTION = "Shared library for libmicrohttpd (Small embeddable http server library)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.77"

RPM_NAME = "libmicrohttpd12-0.9.77-1.1.aarch64.rpm"
RPM_HASH = "a788a200916b60b67df30d4f86cfc3236b1bed58e0a566c524f9770de8d729d436189eff8c4de6c80296b28a4f2b4905631a00dfa03a3f35bfa91d37bf002b34"

RPROVIDES:${PN} += "libmicrohttpd.so.12()(64bit) \
libmicrohttpd12 \
libmicrohttpd12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit)"

inherit rpm

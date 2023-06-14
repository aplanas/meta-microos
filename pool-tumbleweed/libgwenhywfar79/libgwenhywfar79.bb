SUMMARY = "Multiplatform Helper Library for Other Libraries"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwenhywfar79-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "810aca7e56dedcf497208ef96c72ca4fb76de44e2a6cf7a13adbe377994fa9cccdea30e02ef20f89bcb170e1b1fc1b944d28fb2e0b4d4d23f02d2ea97510b50d"

RPROVIDES:${PN} += "libgwenhywfar.so.79 \
libgwenhywfar79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libgpg-error.so.0"

inherit rpm

SUMMARY = "Qualcomm IPC Router protocol helper library"
DESCRIPTION = "libqrtr-glib is a glib-based library to use and manage the QRTR (Qualcomm \
IPC Router) bus."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libqrtr-glib0-1.2.2-1.4.aarch64.rpm"
RPM_HASH = "f42103b27abbf08ac8113facb28af7e897c805281f9bcc133aa6584aee0a06368b5037a1048d533292f2738fffd6e6dd155d08a5cc5d908743ac8d78e9e2a3f5"

RPROVIDES:${PN} += "libqrtr-glib.so.0()(64bit) \
libqrtr-glib0 \
libqrtr-glib0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm

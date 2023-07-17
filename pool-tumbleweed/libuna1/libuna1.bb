SUMMARY = "Library to support Unicode and ASCII (byte string) conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions."
LICENSE = "LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "libuna1-20230710-1.1.aarch64.rpm"
RPM_HASH = "8a73354a119c164a886c8955388d4d212d62f3e1e0ef306309a99802b3afbe11a273fdec7a38da28a108042f30e33ba76886843ae35a9443879c939799aad929"

RPROVIDES:${PN} += "libuna.so.1 \
libuna1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm

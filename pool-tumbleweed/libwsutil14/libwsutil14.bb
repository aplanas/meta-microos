SUMMARY = "Library for wireshark utilities"
DESCRIPTION = "The libwsutil library provides utility functions for libwireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "libwsutil14-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "3a45250d82b04809868f3f5df8d4edc30ef14a81ddeb0bfca23c2259e8fb851c93282d4f7ade2ff0a243ca03bde6681c800e9092971217e9846201d07ca6c814"

RPROVIDES:${PN} += "libwsutil.so.14()(64bit) \
libwsutil14 \
libwsutil14(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libpcre2-8.so.0()(64bit)"

inherit rpm

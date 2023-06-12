SUMMARY = "Library for Crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libgcr-4-4-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "72a51e376d68e5b803bfa8572fe0be0167137464f0076f53ad3e13c3150d4976dd88f35a5ac6a612787023f7cc3747260ceb4cd2958f017bf9a0905daa965586"

RPROVIDES:${PN} += "gcr \
libgcr-4-4 \
libgcr-4-4(aarch-64) \
libgcr-4.so.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libgck-2.so.2()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libp11-kit.so.0()(64bit) \
libp11-kit.so.0(LIBP11_KIT_1.0)(64bit)"

inherit rpm

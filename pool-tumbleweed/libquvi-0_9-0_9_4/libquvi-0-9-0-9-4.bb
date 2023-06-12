SUMMARY = "Library to parse flash media stream URLs"
DESCRIPTION = "libquvi is a cross-platform library for parsing flash media stream \
URLs with C API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "libquvi-0_9-0_9_4-0.9.4-7.6.aarch64.rpm"
RPM_HASH = "7aca7e537a117c85e53c12a732add5a62d5ef9e065049defd90c3b2482ae2b7663255b1c3d7854598ed91fc363a16842e152c2b0594606ac5c0e2aae1b25c719"

RPROVIDES:${PN} += "libquvi \
libquvi-0.9-0.9.4.so()(64bit) \
libquvi-0_9-0_9_4 \
libquvi-0_9-0_9_4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcurl.so.4()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libglib-2.0.so.0()(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit) \
liblua5.4.so.5()(64bit) \
libproxy.so.1()(64bit) \
libproxy.so.1(LIBPROXY_0.4.16)(64bit)"

inherit rpm

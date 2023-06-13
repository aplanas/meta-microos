SUMMARY = "The GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls30-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "0a5be643d8eda09bfb2b9413aa2fe285a5e35b39b3fa296403146194b1c37a1e9cea441940621ed1c940f2b182677890738257b2771917cb3fac7ae0efbf289d"

RPROVIDES:${PN} += "libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_0)(64bit) \
libgnutls.so.30(GNUTLS_3_6_10)(64bit) \
libgnutls.so.30(GNUTLS_3_6_12)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgnutls.so.30(GNUTLS_3_6_14)(64bit) \
libgnutls.so.30(GNUTLS_3_6_2)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libgnutls.so.30(GNUTLS_3_6_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_5)(64bit) \
libgnutls.so.30(GNUTLS_3_6_6)(64bit) \
libgnutls.so.30(GNUTLS_3_6_8)(64bit) \
libgnutls.so.30(GNUTLS_3_6_9)(64bit) \
libgnutls.so.30(GNUTLS_3_7_0)(64bit) \
libgnutls.so.30(GNUTLS_3_7_2)(64bit) \
libgnutls.so.30(GNUTLS_3_7_3)(64bit) \
libgnutls.so.30(GNUTLS_3_7_4)(64bit) \
libgnutls.so.30(GNUTLS_3_7_5)(64bit) \
libgnutls.so.30(GNUTLS_3_7_7)(64bit) \
libgnutls.so.30(GNUTLS_FIPS140_3_4)(64bit) \
libgnutls.so.30(GNUTLS_PRIVATE_3_4)(64bit) \
libgnutls30 \
libgnutls30(aarch-64) \
libgnutls30-hmac"

RDEPENDS:${PN} += "/sbin/ldconfig \
crypto-policies \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
libidn2.so.0()(64bit) \
libidn2.so.0(IDN2_0.0.0)(64bit) \
libjitterentropy.so.3()(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libp11-kit.so.0()(64bit) \
libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) \
libtasn1.so.6()(64bit) \
libtasn1.so.6(LIBTASN1_0_3)(64bit) \
libunistring.so.5()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm

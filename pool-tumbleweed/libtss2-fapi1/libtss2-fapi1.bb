SUMMARY = "FAPI interface library"
DESCRIPTION = "This is the tpm2 Feature API (FAPI) library. This API is designed to be very \
high-level API, intended to make programming with the TPM as simple as \
possible."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-fapi1-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "52037e6f922f751d8f371c44f68484c57d8ead441293fd8f707e70120e1e2c8da7ba53dec12bfea4a65426b9aded0819e5df8e81ab84005f16ce9230837cc69f"

RPROVIDES:${PN} += "libtss2-fapi.so.1()(64bit) \
libtss2-fapi1 \
libtss2-fapi1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libtss2-esys.so.0()(64bit) \
libtss2-mu.so.0()(64bit) \
libtss2-tctildr.so.0()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm

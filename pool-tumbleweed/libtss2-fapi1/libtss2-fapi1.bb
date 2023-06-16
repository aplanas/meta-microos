SUMMARY = "FAPI interface library"
DESCRIPTION = "This is the tpm2 Feature API (FAPI) library. This API is designed to be very \
high-level API, intended to make programming with the TPM as simple as \
possible."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-fapi1-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "52037e6f922f751d8f371c44f68484c57d8ead441293fd8f707e70120e1e2c8da7ba53dec12bfea4a65426b9aded0819e5df8e81ab84005f16ce9230837cc69f"

RPROVIDES:${PN} += "libtss2-fapi.so.1 \
libtss2-fapi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libjson-c.so.5 \
libtss2-esys.so.0 \
libtss2-mu.so.0 \
libtss2-tctildr.so.0 \
libuuid.so.1"

inherit rpm

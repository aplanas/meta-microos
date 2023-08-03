SUMMARY = "FAPI interface library"
DESCRIPTION = "This is the tpm2 Feature API (FAPI) library. This API is designed to be very \
high-level API, intended to make programming with the TPM as simple as \
possible."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-fapi1-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "d89b1c8340db4dfaace2743dc3811ce004dd1535ee67d48d22d94c4e454669061e18669a4cf98c53ca1bc848530985d31d3ceb2ae2371a02a844382e7d0a5d15"

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

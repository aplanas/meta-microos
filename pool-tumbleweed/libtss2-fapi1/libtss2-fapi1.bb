SUMMARY = "FAPI interface library"
DESCRIPTION = "This is the tpm2 Feature API (FAPI) library. This API is designed to be very \
high-level API, intended to make programming with the TPM as simple as \
possible."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-fapi1-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "d5a2a897e1b304dd4305ee892766b4339d374b753b401b38eea9a5d2a8ceba89da9bebd46771d62244ae954fb365b63ffe4654b6df5ab73e26fa3c5e385094e5"

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

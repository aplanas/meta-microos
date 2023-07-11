SUMMARY = "Software TPM emulator"
DESCRIPTION = "The SWTPM package provides TPM emulators with different front-end interfaces \
to libtpms. TPM emulators provide socket interfaces (TCP/IP) and the Linux \
CUSE interface for the creation of multiple native /dev/vtpm* devices. \
Those can be the targets of multiple QEMU cuse-tpm instances."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "swtpm-0.8.0-4.1.aarch64.rpm"
RPM_HASH = "b84e12ac93cf32b8ffae891f31827a745aa9064abda9e44c7f9eadb277c21b851d9c03d6c34bcb482b0fe14465ac659220bdb4817b3a8c186a2e9b4a52beb5c5"

RPROVIDES:${PN} += "config-swtpm \
libswtpm-libtpms.so.0 \
swtpm"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/env \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libseccomp.so.2 \
libtasn1.so.6 \
libtpms.so.0 \
user-tss"

inherit rpm

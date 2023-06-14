SUMMARY = "Software TPM emulator"
DESCRIPTION = "The SWTPM package provides TPM emulators with different front-end interfaces \
to libtpms. TPM emulators provide socket interfaces (TCP/IP) and the Linux \
CUSE interface for the creation of multiple native /dev/vtpm* devices. \
Those can be the targets of multiple QEMU cuse-tpm instances."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "swtpm-0.8.0-3.1.aarch64.rpm"
RPM_HASH = "2bafa11d559f625a4f615eec52ea8159a75cc603054aece1fc548b9c87b40cd3f71ce41ac9a4aaf5f3df3027cb87ead6f8011b4206e94762eabbea1b44bd1a51"

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

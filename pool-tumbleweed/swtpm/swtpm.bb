SUMMARY = "Software TPM emulator"
DESCRIPTION = "The SWTPM package provides TPM emulators with different front-end interfaces \
to libtpms. TPM emulators provide socket interfaces (TCP/IP) and the Linux \
CUSE interface for the creation of multiple native /dev/vtpm* devices. \
Those can be the targets of multiple QEMU cuse-tpm instances."
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "swtpm-0.8.0-3.1.aarch64.rpm"
RPM_HASH = "2bafa11d559f625a4f615eec52ea8159a75cc603054aece1fc548b9c87b40cd3f71ce41ac9a4aaf5f3df3027cb87ead6f8011b4206e94762eabbea1b44bd1a51"

RPROVIDES:${PN} += "config(swtpm) \
libswtpm_libtpms.so.0()(64bit) \
swtpm \
swtpm(aarch-64)"

RDEPENDS:${PN} += "(swtpm-selinux if selinux-policy-base) \
/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/env \
iproute2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.4)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libseccomp.so.2()(64bit) \
libtasn1.so.6()(64bit) \
libtasn1.so.6(LIBTASN1_0_3)(64bit) \
libtpms.so.0()(64bit) \
libtpms.so.0(LIBTPMS_0.5.1)(64bit) \
libtpms.so.0(LIBTPMS_0.6.0)(64bit) \
user(tss)"

inherit rpm

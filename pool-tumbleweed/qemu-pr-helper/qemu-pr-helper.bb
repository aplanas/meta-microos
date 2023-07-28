SUMMARY = "QEMU persistent reservation helper"
DESCRIPTION = "This package provides a helper utility for SCSI persistent reservations."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-pr-helper-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "db01183e48ab1b5980f72c7268624a0c93ef4daf836cbe83aa95b1fecee05f6aeabfc331ced11a5816f1130dd8077d525467ddd663640f016092e21adc096a74"

RPROVIDES:${PN} += "qemu-pr-helper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libm.so.6 \
libmpathpersist.so.0 \
libnuma.so.1 \
libpam.so.0 \
libudev.so.1 \
liburing.so.2"

inherit rpm

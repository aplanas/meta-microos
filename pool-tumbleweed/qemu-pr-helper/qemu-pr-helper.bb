SUMMARY = "QEMU persistent reservation helper"
DESCRIPTION = "This package provides a helper utility for SCSI persistent reservations."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-pr-helper-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "d1ff1d59231064f393bef5fff9a9a95af01b069c285542868ba1acc1dbbb041c427d3527c89f1bd177f0249d758138d0fbf093545d096eb397e0d07abce3bf16"

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

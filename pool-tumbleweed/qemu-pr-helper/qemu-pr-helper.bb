SUMMARY = "QEMU persistent reservation helper"
DESCRIPTION = "This package provides a helper utility for SCSI persistent reservations."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-pr-helper-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "dc0b27b75a0f5bd6895eea9fde7a46d932096573021cadbbbe77a90454607c6e4ad50d87e08302af600057dc42296d71732dce4d0905f8e494b251bae5b75803"

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

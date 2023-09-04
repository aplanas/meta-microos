SUMMARY = "iSCSI block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
iSCSI network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-block-iscsi-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "3d8c4a2f47486037abb59a902a8a2d14e5ddf43a88d32a354671e2adb516cf723289a0006cdc1cddc02e65b0ef4b036f18ee19c4b8de3a633b6c4446e3659fd4"

RPROVIDES:${PN} += "qemu-block-iscsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiscsi.so.9 \
libm.so.6"

inherit rpm

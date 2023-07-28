SUMMARY = "iSCSI block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
iSCSI network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-iscsi-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "46376238dc2a5a17cd2d423ce9fe606639d6ccff757fe13d9bceba98049123de82d0c55b1f2e2607b86d1b7c7079c8fde73c7d3e593e14caa1ac84b2f02bb69f"

RPROVIDES:${PN} += "qemu-block-iscsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiscsi.so.9 \
libm.so.6"

inherit rpm

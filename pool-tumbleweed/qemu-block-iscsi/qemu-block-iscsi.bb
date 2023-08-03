SUMMARY = "iSCSI block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
iSCSI network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-iscsi-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "bd69dc142662dd2d20f7a05cb1bd6dc226b4dad189ef8e6f96ae6a4b677b82d142b1b192bc2c82babcdf87165c2bd3883678128ad85d3945f87ba5f9e07e0c0f"

RPROVIDES:${PN} += "qemu-block-iscsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiscsi.so.9 \
libm.so.6"

inherit rpm

SUMMARY = "iSCSI block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
iSCSI network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-iscsi-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "a7be870505e20924cb1cd95037c67752cd6ad8b041bc22b0128f6da4c1aae42dac2b136858311f239a7300fc22ba1fedd0155f95f16ca14884a6989ea43556ad"

RPROVIDES:${PN} += "qemu-block-iscsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiscsi.so.9 \
libm.so.6"

inherit rpm

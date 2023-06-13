SUMMARY = "iSCSI block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over an \
iSCSI network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-iscsi-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "0704a788d263b75daec955cf7248d4ad585f513b18fd48f50878fc60d87d27a425d1228703136ab93c7ff09e60e1c7ba8c5631137d9d25eaca89529ac92410b9"

RPROVIDES:${PN} += "qemu-block-iscsi \
qemu-block-iscsi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libiscsi.so.9()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm

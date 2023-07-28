SUMMARY = "GlusterFS block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over a \
GlusterFS network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-gluster-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "aa59e51f7632318f4a2856fc1cbdcd57b14d036456fe386b7c273e0e37250f49bbf5521388ab7ebdeb1159d1b6acf017c811dce18127b3916ab23f805c2c4d5e"

RPROVIDES:${PN} += "qemu-block-gluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0"

inherit rpm

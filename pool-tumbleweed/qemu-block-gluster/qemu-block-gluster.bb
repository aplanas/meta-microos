SUMMARY = "GlusterFS block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over a \
GlusterFS network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-block-gluster-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "ca08d8c95bb4b51ac41c9ffeebac39cb20e10aabf64407fa8865a4109f16746630fa51ca36a9a0d22ee179999d0b2501dd548ff66a6dac137d3afdae7355d542"

RPROVIDES:${PN} += "qemu-block-gluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0"

inherit rpm

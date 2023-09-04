SUMMARY = "cURL block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over \
a network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-block-curl-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "58eba2adeecd4e34941df42d8c2a469cef7dcac2c682a0729a06f1dd6bb48afffd5422fe1740df92555f34113f2c0163d21784eec75574eaa0633d5a8ba2f58a"

RPROVIDES:${PN} += "qemu-block-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm

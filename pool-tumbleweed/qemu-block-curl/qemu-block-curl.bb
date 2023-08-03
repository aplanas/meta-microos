SUMMARY = "cURL block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over \
a network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-curl-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "a9668f808916fbd54425528abc5a8572932bd4e373b84fa5b5c5f2bf1679a362c32fccdc779947335041772d948210644c31f5b098369caa1b59f8374a354c4f"

RPROVIDES:${PN} += "qemu-block-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm

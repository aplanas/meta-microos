SUMMARY = "cURL block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over \
a network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-curl-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "d8874c6cd10f0a7604cda13c77d8c107045f9d46e965d099c46cebcb0dec040a032111be2ce591dc41e458ec619d7442619cf859a118bb4dc1f338978ca5991a"

RPROVIDES:${PN} += "qemu-block-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm

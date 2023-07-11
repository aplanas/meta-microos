SUMMARY = "cURL block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over \
a network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-curl-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "12007581565b1c395ea44c9000ed1ab99f4d78822105a8a6580ae275f6a246e650bb4e87bf847783e5c37c55f97fbb6ea71b2552c38b7b736ca7d8df4dc6acb7"

RPROVIDES:${PN} += "qemu-block-curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm

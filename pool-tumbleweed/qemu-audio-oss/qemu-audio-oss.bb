SUMMARY = "OSS based audio support for QEMU"
DESCRIPTION = "This package contains a module for OSS based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-oss-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "cf0a8772b58d9a53654f19bebd450d9e93b181bafdb667e51947a0ce5740ae631331bd8022dbf18219df9d7565f7609dfeae477cbea3c480fe4bbf7f69dc4683"

RPROVIDES:${PN} += "qemu-audio-oss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

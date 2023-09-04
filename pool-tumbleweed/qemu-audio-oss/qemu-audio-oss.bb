SUMMARY = "OSS based audio support for QEMU"
DESCRIPTION = "This package contains a module for OSS based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-audio-oss-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "46d87a072bcad476bc0b50c438227f8324eeea70f2e783ff55db0872eca05e39eaabfa3b02bc349b98b1d30d6f6faf5be08adfb422e2d2524a61476b7f955579"

RPROVIDES:${PN} += "qemu-audio-oss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

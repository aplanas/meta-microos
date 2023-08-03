SUMMARY = "Pulse Audio based audio support for QEMU"
DESCRIPTION = "This package contains a module for Pulse Audio based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-pa-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "7ad22816d429bef502704e7564ce5f8cbf1148685f7ba5542ecd0dd5d142fc5e230a2d1f041356e894dce2ea2ca538335b3cef83605d6ec806357493f048cb5a"

RPROVIDES:${PN} += "qemu-audio-pa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse.so.0"

inherit rpm

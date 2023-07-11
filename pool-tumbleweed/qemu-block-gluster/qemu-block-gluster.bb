SUMMARY = "GlusterFS block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over a \
GlusterFS network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-gluster-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "b18fe8a5421b9c10285b64ceccab579284ed7aeeeb20ea3d6df216452735ebfdbf6e63575780594f9755f823e3880e9398d4f7898817cdedde1df705f3b3917e"

RPROVIDES:${PN} += "qemu-block-gluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0"

inherit rpm

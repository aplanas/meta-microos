SUMMARY = "GlusterFS block support for QEMU"
DESCRIPTION = "This package contains a module for accessing network-based image files over a \
GlusterFS network connection from qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-gluster-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "7e1bc46bd61b332f59da1abba197f0bb70e444503be0e87cf64e9de8b2f057fbbfa40c4ea1838f0e35db8a545b6ee745a300e339c856ace6b9fd73b2f3ad72c9"

RPROVIDES:${PN} += "qemu-block-gluster"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0"

inherit rpm

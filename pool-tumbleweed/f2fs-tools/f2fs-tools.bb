SUMMARY = "Utilities for the Flash-friendly Filesystem (F2FS)"
DESCRIPTION = "Utilities needed to create and maintain so-called Flash-Friendly (F2) \
filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "f2fs-tools-1.15.0-2.4.aarch64.rpm"
RPM_HASH = "1a1b906fb24e923635460abb027cb10ae4a62acf71f490fccef840c737412bf1bfb32552866f377e754dcbdfa7aaff0c56470b81932c87cdffd89bfa916c6413"

RPROVIDES:${PN} += "f2fs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libf2fs.so.9 \
libselinux.so.1 \
libuuid.so.1"

inherit rpm

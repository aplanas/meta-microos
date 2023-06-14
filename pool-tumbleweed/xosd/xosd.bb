SUMMARY = "X On-Screen Display library"
DESCRIPTION = "A tool for displaying a TV-like on-screen display in X"
LICENSE = "GPL-2.0-or-later"

PV = "2.2.14"

RPM_NAME = "xosd-2.2.14-1.1.aarch64.rpm"
RPM_HASH = "8a3901bc55d86437da1183c60da3d69c9a3b26804d717cde0ea32f514b30d8d223b8d4d5e55a3cac958123052ca9164121f192162ba393cc4c802ad8afc7e89b"

RPROVIDES:${PN} += "xosd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxosd.so.2"

inherit rpm

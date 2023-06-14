SUMMARY = "Library files for vnote"
DESCRIPTION = "This package provides library files for vnote."
LICENSE = "LGPL-3.0-only"

PV = "3.10.1"

RPM_NAME = "libVTextEdit1-3.10.1-1.9.aarch64.rpm"
RPM_HASH = "f1dafcabe4a6d60a690223c3dc97c463c571337ab95c2b4bd3d4e3ff69e7843188860dbdb04c5fdf7c1e7ff68c97e0bd00adbf88a5edd311c54288fedda287bd"

RPROVIDES:${PN} += "libVTextEdit.so.1 \
libVTextEdit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libVSyntaxHighlighting.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

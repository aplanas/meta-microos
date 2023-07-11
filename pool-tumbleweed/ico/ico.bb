SUMMARY = "Simple animation program used for testing X11 operations and extensions"
DESCRIPTION = "ico is a simple animation program that may be used for testing various \
X11 operations and extensions. It displays a wire-frame rotating \
polyhedron, with hidden lines removed, or a solid-fill polyhedron with \
hidden faces removed."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "ico-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "3ea5c28a9f6a71b3a52e63c061bcde038bd4fd27fcb7dcbd4cc00a45ee98751f2d2f0dc478b14aa5deec68d88bc10277e083b2935d33107b6458d8175f685d7e"

RPROVIDES:${PN} += "ico"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm

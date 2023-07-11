SUMMARY = "Tools to work with Adobe/Macromedia drawings"
DESCRIPTION = "This package contains tools to work with Adobe/Macromedia drawings."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-tools-0.1.2-2.19.aarch64.rpm"
RPM_HASH = "d130a52f3ab43442097a8c8e5e47cac223b3d29932a1e2c25eb7fcb360eacf106a9773a444b2819e17c16041856364646cda2e2479849dfd4bf7adda1a655f48"

RPROVIDES:${PN} += "libfreehand-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreehand-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm

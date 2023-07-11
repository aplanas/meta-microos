SUMMARY = "Character-based handwriting input panel"
DESCRIPTION = "CellWriter is a grid-entry natural handwriting input panel. As you \
write characters into the cells, your writing is instantly recognized \
at the character level. When you press Enter on the panel, the input \
you entered is sent to the currently focused application as if typed on \
the keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "cellwriter-1.3.6-4.7.aarch64.rpm"
RPM_HASH = "60b0929929aa539dbec0f50ba1bf080855b007b64924068a9c045c155dc1236fb66e5ce436e4d103b669a46273560129c2381ef7155c0941bca1517ecc394704"

RPROVIDES:${PN} += "cellwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm

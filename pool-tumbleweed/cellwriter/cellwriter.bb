SUMMARY = "Character-based handwriting input panel"
DESCRIPTION = "CellWriter is a grid-entry natural handwriting input panel. As you \
write characters into the cells, your writing is instantly recognized \
at the character level. When you press Enter on the panel, the input \
you entered is sent to the currently focused application as if typed on \
the keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "cellwriter-1.3.6-4.6.aarch64.rpm"
RPM_HASH = "441efa89c396a1858e0ba7411c81f801b485dd5b6191b7e0deaf297de427bb5322c9ba5634c71a03322411e202922f8f606799ebcdca8c471e242413483f3364"

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

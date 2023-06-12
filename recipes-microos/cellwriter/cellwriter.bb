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

RPROVIDES:${PN} += "application() \
application(cellwriter.desktop) \
cellwriter \
cellwriter(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm

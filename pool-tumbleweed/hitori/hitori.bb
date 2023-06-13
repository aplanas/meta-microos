SUMMARY = "Original puzzle of Nikoli"
DESCRIPTION = "Hitori is played with a grid of squares or cells, and each cell contains a number. \
The objective is to eliminate numbers by filling in the squares such that remaining cells do not \
contain numbers that appear more than once in either a given row or column. \
 \
Filled-in cells cannot be horizontally or vertically adjacent, although they can be diagonally \
adjacent. The remaining un-filled cells must form a single component connected horizontally \
and vertically."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "hitori-44.0-1.3.aarch64.rpm"
RPM_HASH = "d8c3d08facc71c9a3ac910e9712fd91dda7ceeb7bd6a9127a7242c42350ae2993a69582aef64ca4d093b5cf41caaed03b60a229769ed2a6e1ebf5d8518f15a4c"

RPROVIDES:${PN} += "application() \
application(org.gnome.Hitori.desktop) \
hitori \
hitori(aarch-64) \
metainfo() \
metainfo(org.gnome.Hitori.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm

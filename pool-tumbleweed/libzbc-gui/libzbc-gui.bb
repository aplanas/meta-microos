SUMMARY = "Graphical frontend for ZBC tools"
DESCRIPTION = "A simple graphical interface showing zone information of a zoned device. \
It also displays the write status (write pointer position) of zones \
graphically using color coding (red for written space and green for \
unwritten space)."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "libzbc-gui-5.13.0-1.4.aarch64.rpm"
RPM_HASH = "bba21019dc83be6f4b33bf517bba65340c66ae6f852d8a357ad609329c703cf7c924d455ab58c3a8d6d295229ca55409fbe691f9ecfc897f0f198f13a80c0cef"

RPROVIDES:${PN} += "libzbc-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libzbc.so.5"

inherit rpm

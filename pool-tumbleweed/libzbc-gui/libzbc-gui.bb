SUMMARY = "Graphical frontend for ZBC tools"
DESCRIPTION = "A simple graphical interface showing zone information of a zoned device. \
It also displays the write status (write pointer position) of zones \
graphically using color coding (red for written space and green for \
unwritten space)."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "5.13.0"

RPM_NAME = "libzbc-gui-5.13.0-1.3.aarch64.rpm"
RPM_HASH = "c3eda37049de2cbe2e455be2a3e44466575271b719a5095dd46ded4fc06e063dc37e363455f1b26d0648c28ccc82b5dfe26d8e3be77c1d987675214cf00c66a9"

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

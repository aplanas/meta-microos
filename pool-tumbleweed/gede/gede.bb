SUMMARY = "Qt-based GUI to GDB"
DESCRIPTION = "Gede is a graphical frontend (GUI) to GDB written in C++ and using the Qt5 toolkit. \
Gede supports debugging programs written in Ada, FreeBasic, C++, C, Rust, Fortran and Go."
LICENSE = "BSD-2-Clause"

PV = "2.19.1"

RPM_NAME = "gede-2.19.1-1.1.aarch64.rpm"
RPM_HASH = "66ecedcc6beb24f232e3bb2fcf91827b3743483b69bd908b732269ca1f304632f499ea361951e6965ff8331beeefae5cb43afa3cfc0e31d9dbfab977a2729edb"

RPROVIDES:${PN} += "gede"

RDEPENDS:${PN} += "ctags \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

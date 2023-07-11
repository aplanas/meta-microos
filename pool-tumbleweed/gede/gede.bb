SUMMARY = "Qt-based GUI to GDB"
DESCRIPTION = "Gede is a graphical frontend (GUI) to GDB written in C++ and using the Qt5 toolkit. \
Gede supports debugging programs written in Ada, FreeBasic, C++, C, Rust, Fortran and Go."
LICENSE = "BSD-2-Clause"

PV = "2.18.3"

RPM_NAME = "gede-2.18.3-1.1.aarch64.rpm"
RPM_HASH = "c4ce3a6164583d8b7da5ede4013fe0bfaf2abbdcd48f7ea803bbb0b77be6840a0089143e636a56714a0d41c97a99d7e109ee447f23b8ffb1f147be930bb224ca"

RPROVIDES:${PN} += "gede"

RDEPENDS:${PN} += "ctags \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

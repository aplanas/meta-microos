SUMMARY = "A High Level Programming Language"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
 \
This package contains the graphical user interface."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "octave-8.2.0-1.1.aarch64.rpm"
RPM_HASH = "d4f6cb9b60b3b5f09084c6e6ea05891c1cc2d21a12e9fe59799e9cd3b3458a30bf025e91e6af9bb5dfce3be6628278be54e36f946fbc67abe96fafd334395c5b"

RPROVIDES:${PN} += "liboctgui.so.9 \
octave \
octave-gui"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liboctave.so.10 \
liboctinterp.so.11 \
libqscintilla2-qt5.so.15 \
libstdc++.so.6 \
octave-cli \
update-alternatives"

inherit rpm

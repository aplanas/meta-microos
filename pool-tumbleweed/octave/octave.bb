SUMMARY = "A High Level Programming Language"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
 \
This package contains the graphical user interface."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.0"

RPM_NAME = "octave-8.3.0-1.1.aarch64.rpm"
RPM_HASH = "27e1f1a8ec8b8ebebe3c5183cfd0da0deb78ed0cd8343f51cc7f8cdd225ef5c286cdf28526a667694a9fe920541c698fd5251ce2a6dd80f5c39d30c265fe6bf6"

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

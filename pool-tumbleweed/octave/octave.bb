SUMMARY = "A High Level Programming Language"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
 \
This package contains the graphical user interface."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "octave-8.2.0-1.2.aarch64.rpm"
RPM_HASH = "1ee9619ff9abe8088839a810a1dca7e11d9c135f76d56211f0fbffd43634a69120cedb91c59fc9fb3ede211e85790d4cb925a72d279f03df539eed8382db98bb"

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

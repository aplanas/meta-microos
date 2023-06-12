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

RPROVIDES:${PN} += "application() \
application(org.octave.Octave.desktop) \
liboctgui.so.9()(64bit) \
metainfo() \
metainfo(org.octave.Octave.appdata.xml) \
mimehandler(text/x-matlab) \
mimehandler(text/x-octave) \
octave \
octave(aarch-64) \
octave-gui"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Help.so.5()(64bit) \
libQt5Help.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
liboctave.so.10()(64bit) \
liboctinterp.so.11()(64bit) \
libqscintilla2_qt5.so.15()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli \
update-alternatives"

inherit rpm

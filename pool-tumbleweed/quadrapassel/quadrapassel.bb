SUMMARY = "Tetris Game for GNOME"
DESCRIPTION = "Quadrapassel is a version of Tetris, the classic game of interlocking \
four-piece blocks. As they fall from the top, the player must orient \
them to fit the other blocks at the bottom so that they form a \
complete horizontal line, in which case that line disappears and the \
player gains points"
LICENSE = "GPL-2.0-or-later"

PV = "40.2"

RPM_NAME = "quadrapassel-40.2-1.10.aarch64.rpm"
RPM_HASH = "e015963f31480d066958af69dfb83aeba0958298ea18c3512ae8a0ca1c0bfbeeb416810371349ada213a32b3934225315b86d0fe790f8eab8392dec11fb5014e"

RPROVIDES:${PN} += "application() \
application(org.gnome.Quadrapassel.desktop) \
metainfo() \
metainfo(org.gnome.Quadrapassel.appdata.xml) \
quadrapassel \
quadrapassel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsound.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmanette-0.2.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm

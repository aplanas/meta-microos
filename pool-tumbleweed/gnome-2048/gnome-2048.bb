SUMMARY = "Sliding block puzzle game"
DESCRIPTION = "2048 is a single-player sliding block puzzle game, in which the \
objective is to slide and merge same-numbered tiles on a grid to \
reach higher numbers."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-2048-3.38.2-2.7.aarch64.rpm"
RPM_HASH = "e512284d0f4454708f9cb1025819b8c68651a1d407d8971e4faa3f76f6e9cb5ab0ca49440b2ef873918230e344b7ac88a6f52ffd773f8b4cffa8e14ed63caf7c"

RPROVIDES:${PN} += "application() \
application(org.gnome.TwentyFortyEight.desktop) \
gnome-2048 \
gnome-2048(aarch-64) \
metainfo() \
metainfo(org.gnome.TwentyFortyEight.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-games-support-1.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm

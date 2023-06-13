SUMMARY = "Tetravex Game for GNOME"
DESCRIPTION = "Tetravex is a simple puzzle game in which pieces have numbers on each \
side. The pieces must be positioned so that the same numbers touch \
each other, during which you are being timed. The times are then \
stored in a system-wide scoreboard."
LICENSE = "GPL-2.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-tetravex-3.38.2-2.7.aarch64.rpm"
RPM_HASH = "8f17c08d17f929305085be2221ba43d6162860424376a5c9ba29117b7a48f3846386c929d0876c5ba6a77d456a5de1cd5c0065a86da03cb58c718be037a0021f"

RPROVIDES:${PN} += "application() \
application(org.gnome.Tetravex.desktop) \
gnome-tetravex \
gnome-tetravex(aarch-64) \
metainfo() \
metainfo(org.gnome.Tetravex.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm

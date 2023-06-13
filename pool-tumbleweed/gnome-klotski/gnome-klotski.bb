SUMMARY = "Klotski Game for GNOME"
DESCRIPTION = "Klotski is a puzzle game of which the objective is to get the \
patterned block to the marker, which is done by moving the blocks in \
its way."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-klotski-3.38.2-1.13.aarch64.rpm"
RPM_HASH = "2106cc891559e6d5fa2bbbc40012746c385a25c658b439c7f88a13cb7fcf777b9d7c66c5ce8e90b3cff43cec18a3e8e56dcd5b1e9e1f81ca155062cb29d39662"

RPROVIDES:${PN} += "application() \
application(org.gnome.Klotski.desktop) \
gnome-klotski \
gnome-klotski(aarch-64) \
metainfo() \
metainfo(org.gnome.Klotski.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-games-support-1.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm

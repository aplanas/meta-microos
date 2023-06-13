SUMMARY = "GNOME Tour & Greeter"
DESCRIPTION = "A guided tour and greeter for GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-tour-44.0-2.1.aarch64.rpm"
RPM_HASH = "afdebddc6611e63c59de75f68af0cdc8472131fd3476bc51b15ce8abc86be13073df2a9871c1a67c64b86054d703cf3d6a01c2a1edbafb68d696946ce311377e"

RPROVIDES:${PN} += "application() \
application(org.gnome.Tour.desktop) \
gnome-tour \
gnome-tour(aarch-64) \
metainfo() \
metainfo(org.gnome.Tour.metainfo.xml)"

RDEPENDS:${PN} += "libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm

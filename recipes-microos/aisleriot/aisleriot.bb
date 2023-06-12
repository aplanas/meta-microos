SUMMARY = "Solitaire Card Games for GNOME"
DESCRIPTION = "Aisleriot is a compilation of 80 different solitaire card games."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.29"

RPM_NAME = "aisleriot-3.22.29-1.1.aarch64.rpm"
RPM_HASH = "94b6f1018f93524dea0835e6bebee646e0a384f74c00ab7a70d3d0c71ef38830bf50ad9b09aac3a1b434452b57969f94fb21c9a54c700ad31fe308a2c79fb992"

RPROVIDES:${PN} += "aisleriot \
aisleriot(aarch-64) \
application() \
application(sol.desktop) \
metainfo() \
metainfo(sol.metainfo.xml)"
RDEPENDS:${PN} += "guile \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libguile-3.0.so.1()(64bit) \
libguile-3.0.so.1(GUILE_2.0)(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm

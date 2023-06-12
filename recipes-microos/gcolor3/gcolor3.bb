SUMMARY = "A color chooser written in GTK3 (like gcolor2)"
DESCRIPTION = "Gcolor3 enables picking the color from any pixel on the screen. It \
also offers a palette to mix and match a couple of colors together. \
Colors can be saved and retrieved."
LICENSE = "GPL-2.0-only"

PV = "2.4.0"

RPM_NAME = "gcolor3-2.4.0-2.7.aarch64.rpm"
RPM_HASH = "26eda8aa8df4ab6b37b587048f0f8fc4560a2fdec2403dcb9c5d29e001f11e07b5ad7854766ce8d87a92d3f89bccd83fb52e83c51d2f72a9e5e699274219d3b6"

RPROVIDES:${PN} += "application() \
application(nl.hjdskes.gcolor3.desktop) \
gcolor3 \
gcolor3(aarch-64) \
metainfo() \
metainfo(nl.hjdskes.gcolor3.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libportal-gtk3.so.1()(64bit) \
libportal.so.1()(64bit)"

inherit rpm

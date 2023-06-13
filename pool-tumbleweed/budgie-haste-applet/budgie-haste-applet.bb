SUMMARY = "Budgie Haste Applet"
DESCRIPTION = "Post any text, be it code or prose, to various services directly from your \
desktop."
LICENSE = "GPL-2.0-or-later"

PV = "20200228"

RPM_NAME = "budgie-haste-applet-20200228-2.7.aarch64.rpm"
RPM_HASH = "f9eb42c9398bdbb5ca56353d3158366aa30d4ed9a6ab6732f8183e2e649c50c9468c15f236013d018e8821c11610df47627e648f15435962895d5de110b0f4df"

RPROVIDES:${PN} += "budgie-haste-applet \
budgie-haste-applet(aarch-64) \
libhasteapplet.so()(64bit) \
metainfo() \
metainfo(com.github.cybre.budgie-haste-applet.appdata.xml)"

RDEPENDS:${PN} += "libbudgie-plugin.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpeas-1.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit)"

inherit rpm

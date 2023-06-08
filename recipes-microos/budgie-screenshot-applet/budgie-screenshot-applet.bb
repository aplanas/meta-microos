SUMMARY = "Screenshot applet for Budgie Desktop"
DESCRIPTION = "Take a screenshot of your desktop, a window or region; save to disk and upload."
LICENSE = "GPL-2.0-or-later"

PV = "20200503"

RPM_NAME = "budgie-screenshot-applet-20200503-2.8.aarch64.rpm"
RPM_HASH = "0d8e1d433175003aff8ee624fb4cbc1a1d8ed9b67df7b292b92e1fc80d5164b5326de6b0f9648eedb131730d3ee5d06554359bf8883d4ca5aa6bdce7f5a70b56"

RPROVIDES:${PN} += "budgie-screenshot-applet budgie-screenshot-applet(aarch-64) libscreenshotapplet.so()(64bit) metainfo() metainfo(com.github.cybre.budgie-screenshot-applet.appdata.xml)"
RDEPENDS:${PN} += "libbudgie-plugin.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libcurl.so.4()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnome-desktop-3.so.20()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpeas-1.0.so.0()(64bit) libsoup-2.4.so.1()(64bit)"

inherit rpm

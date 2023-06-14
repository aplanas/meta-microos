SUMMARY = "Screenshot applet for Budgie Desktop"
DESCRIPTION = "Take a screenshot of your desktop, a window or region; save to disk and upload."
LICENSE = "GPL-2.0-or-later"

PV = "20200503"

RPM_NAME = "budgie-screenshot-applet-20200503-2.8.aarch64.rpm"
RPM_HASH = "0d8e1d433175003aff8ee624fb4cbc1a1d8ed9b67df7b292b92e1fc80d5164b5326de6b0f9648eedb131730d3ee5d06554359bf8883d4ca5aa6bdce7f5a70b56"

RPROVIDES:${PN} += "budgie-screenshot-applet \
libscreenshotapplet.so"

RDEPENDS:${PN} += "libbudgie-plugin.so.0 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpeas-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm

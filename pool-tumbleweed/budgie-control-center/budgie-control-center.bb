SUMMARY = "Fork of GNOME Control Center for Budgie 10"
DESCRIPTION = "Fork of GNOME Control Center for Budgie 10"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0+0"

RPM_NAME = "budgie-control-center-1.3.0+0-1.1.aarch64.rpm"
RPM_HASH = "8ca9b5c3e9b9dbef0468a43a6cefaad5d0c57284b5403e83f02d70f5ab827b38f536ba45400a4af724dfa960a0af96204a090acd6a65d79a134e56533008fa11"

RPROVIDES:${PN} += "budgie-control-center"

RDEPENDS:${PN} += "colord \
gnome-color-manager \
gnome-online-accounts \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libaccountsservice.so.0 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcheese-gtk.so.25 \
libcheese.so.8 \
libcolord-gtk.so.1 \
libcolord.so.2 \
libcups.so.2 \
libepoxy.so.0 \
libfontconfig.so.1 \
libgcr-base-3.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-bluetooth.so.13 \
libgnome-desktop-3.so.20 \
libgnutls.so.30 \
libgoa-1.0.so.0 \
libgoa-backend-1.0.so.1 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libgudev-1.0.so.0 \
libhandy-1.so.0 \
libibus-1.0.so.5 \
libkrb5.so.3 \
libm.so.6 \
libmalcontent-0.so.0 \
libmm-glib.so.0 \
libnm.so.0 \
libnma.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libpwquality.so.1 \
libsecret-1.so.0 \
libsmbclient.so.0 \
libudisks2.so.0 \
libupower-glib.so.3 \
libwacom.so.9 \
libxml2.so.2"

inherit rpm

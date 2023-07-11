SUMMARY = "The GNOME Control Center"
DESCRIPTION = "The control center is GNOME's main interface for configuration of \
various aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-control-center-44.3-1.1.aarch64.rpm"
RPM_HASH = "7706801ea3dfcc87fc1d808066da6359fa5fecec83d9b8cadafe80f3acf920210eaa093426c1c250b7e7cf0054ed964c0b7e66a63dbffc3c214c9107ba5321a8"

RPROVIDES:${PN} += "gnome-control-center"

RDEPENDS:${PN} += "gnome-settings-daemon \
gnome-themes-accessibility \
gnome-version \
gnomekbd-tools \
iso-codes \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libaccountsservice.so.0 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libcolord-gtk4.so.1 \
libcolord.so.2 \
libcups.so.2 \
libepoxy.so.0 \
libfontconfig.so.1 \
libgcr-base-3.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-bg-4.so.2 \
libgnome-bluetooth-ui-3.0.so.13 \
libgnome-desktop-4.so.2 \
libgnome-rr-4.so.2 \
libgnutls.so.30 \
libgoa-1.0.so.0 \
libgoa-backend-1.0.so.1 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libgtop-2.0.so.11 \
libgudev-1.0.so.0 \
libibus-1.0.so.5 \
libkrb5.so.3 \
libm.so.6 \
libmalcontent-0.so.0 \
libmm-glib.so.0 \
libnm.so.0 \
libnma-gtk4.so.0 \
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

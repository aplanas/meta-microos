SUMMARY = "GNOME Initial Setup Assistant"
DESCRIPTION = "Initial assistant, helping you to get the system up and running."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-initial-setup-44.0-2.2.aarch64.rpm"
RPM_HASH = "ebb139180611589b6ee2dba0aeffa2f2fcff32ad31a12262e3e9a6d098c70f7d8968dfe32291b732f1a2d6bf4de335cc5e37f21c9182d371c98db9476ba971eb"

RPROVIDES:${PN} += "gnome-initial-setup \
group-gnome-initial-setup \
user-gnome-initial-setup"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-getting-started-docs \
ld-linux-aarch64.so.1 \
libaccountsservice.so.0 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdm.so.1 \
libgeoclue-2.so.0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-4.so.2 \
libgoa-1.0.so.0 \
libgoa-backend-1.0.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libgweather-4.so.0 \
libibus-1.0.so.5 \
libjson-glib-1.0.so.0 \
libkrb5.so.3 \
libm.so.6 \
libnm.so.0 \
libnma-gtk4.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libpwquality.so.1 \
librest-1.0.so.0 \
libsecret-1.so.0 \
libwebkitgtk-6.0.so.4 \
sysuser-shadow"

inherit rpm

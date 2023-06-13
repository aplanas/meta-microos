SUMMARY = "GNOME Initial Setup Assistant"
DESCRIPTION = "Initial assistant, helping you to get the system up and running."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-initial-setup-44.0-2.2.aarch64.rpm"
RPM_HASH = "ebb139180611589b6ee2dba0aeffa2f2fcff32ad31a12262e3e9a6d098c70f7d8968dfe32291b732f1a2d6bf4de335cc5e37f21c9182d371c98db9476ba971eb"

RPROVIDES:${PN} += "application() \
application(gnome-initial-setup.desktop) \
gnome-initial-setup \
gnome-initial-setup(aarch-64) \
group(gnome-initial-setup) \
user(gnome-initial-setup)"

RDEPENDS:${PN} += "/bin/sh \
gnome-getting-started-docs \
ld-linux-aarch64.so.1()(64bit) \
libaccountsservice.so.0()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgdm.so.1()(64bit) \
libgeoclue-2.so.0()(64bit) \
libgeocode-glib-2.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-desktop-4.so.2()(64bit) \
libgoa-1.0.so.0()(64bit) \
libgoa-backend-1.0.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgweather-4.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libm.so.6()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnma-gtk4.so.0()(64bit) \
libnma-gtk4.so.0(libnma_1_2_0)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libpwquality.so.1()(64bit) \
librest-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libwebkitgtk-6.0.so.4()(64bit) \
sysuser-shadow"

inherit rpm

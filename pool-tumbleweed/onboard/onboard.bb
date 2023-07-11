SUMMARY = "Simple on-screen Keyboard"
DESCRIPTION = "Onboard is an onscreen keyboard useful for tablet PC users and for mobility impaired users."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "onboard-1.4.1-7.7.aarch64.rpm"
RPM_HASH = "fdebf77b93a57061c7a16b49ec3ca9221cf65ddfe55a717e4309047ec9fef5d2febc584d1668540973141119c2db96379adce7d9fd8d8462c549121ee758ce1e"

RPROVIDES:${PN} += "onboard \
python3.11dist-onboard \
python3dist-onboard"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1-python3 \
gdk-pixbuf-loader-rsvg \
gsettings-desktop-schemas \
hicolor-icon-theme \
iso-codes \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libcanberra.so.0 \
libdconf.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhunspell-1.7.so.0 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libxkbfile.so.1 \
python-abi \
python3-cairo \
python3-gobject-Gdk \
python3-gobject-cairo \
typelib-AppIndicator3 \
typelib-Atspi \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm

SUMMARY = "Simple on-screen Keyboard"
DESCRIPTION = "Onboard is an onscreen keyboard useful for tablet PC users and for mobility impaired users."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "onboard-1.4.1-7.6.aarch64.rpm"
RPM_HASH = "1a9538f67c8c50763480901aa92950766374dc482093f8e6f7cca2523c0f29d9be60e1e88b9a0e891a3eac6959ca6f0b4fe090ebf375449d32e4957d39153b77"

RPROVIDES:${PN} += "onboard \
python3.10dist-onboard \
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

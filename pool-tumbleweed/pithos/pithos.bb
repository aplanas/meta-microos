SUMMARY = "Native Pandora Radio client for Linux"
DESCRIPTION = "Pithos is a native Pandora Radio client for Linux. It's much more \
lightweight than the Pandora.com web client, and integrates with desktop \
features such as media keys, notifications, and the sound menu."
LICENSE = "GPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "pithos-1.6.0-1.3.noarch.rpm"
RPM_HASH = "cf122e1303929f4fe0493044b8d63bc11c0eacd3dfd776d8b04d08e64ab94f2e1bc4a8da4e1bbaa4ae760629514e9949f1d0fe1f202eb35144acd2b08f026f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pithos"

RDEPENDS:${PN} += "/usr/bin/env \
gstreamer-plugins-bad \
gstreamer-plugins-good \
python3-cairo \
python3-gobject-Gdk \
typelib-Dbusmenu \
typelib-DbusmenuGtk3 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstPbutils \
typelib-Gtk \
typelib-Keybinder \
typelib-Pango \
typelib-Secret"

inherit rpm

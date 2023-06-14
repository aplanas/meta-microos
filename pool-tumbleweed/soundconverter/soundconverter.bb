SUMMARY = "Sound Converter Application for the GNOME Desktop"
DESCRIPTION = "A sound converter application for the GNOME environment. \
 \
It reads anything the GStreamer library can read, and offers writing \
to WAV, FLAC, MP3, AAC, and Ogg Vorbis, also with the help of GStreamer."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "soundconverter-4.0.3-1.4.aarch64.rpm"
RPM_HASH = "40306bcae052f5d65091b88d492edcbab9c2442db6148a07a1cd3d110b2c8176c0b28a5a83eb62890cfc531ccc4ac97805cc7b600f93fcff51b7ed37a0d8eecf"

RPROVIDES:${PN} += "python3.10dist-soundconverter \
python3dist-soundconverter \
soundconverter"

RDEPENDS:${PN} += "/usr/bin/python3 \
gstreamer \
gstreamer-plugins-base \
gstreamer-plugins-good \
python-abi \
python3-gobject \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gst \
typelib-GstPbutils \
typelib-Gtk \
typelib-Notify \
typelib-Pango"

inherit rpm

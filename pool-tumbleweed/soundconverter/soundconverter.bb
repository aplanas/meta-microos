SUMMARY = "Sound Converter Application for the GNOME Desktop"
DESCRIPTION = "A sound converter application for the GNOME environment. \
 \
It reads anything the GStreamer library can read, and offers writing \
to WAV, FLAC, MP3, AAC, and Ogg Vorbis, also with the help of GStreamer."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "soundconverter-4.0.3-1.5.aarch64.rpm"
RPM_HASH = "18accfeda8a7a422b9120872aefb9ab6e215768399eadd107c594799ecf1107b71fd64001b3f45382da9435991fa7acc67d32f2a2299606bc9f1061d65e13c0b"

RPROVIDES:${PN} += "python3.11dist-soundconverter \
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

SUMMARY = "An ear training program"
DESCRIPTION = "Solfege is an eartraining program for X written in python, using \
the GTK+ and GNOME libraries. To use this software you need some \
basic knowledge about music theory. Using solfege you can learn \
to recognise melodic and harmonic intervals, compare interval \
sizes, sing the intervals the computer asks for, identify chords, \
sing chords, scales, dictation and remember rhythmic patterns."
LICENSE = "GPL-3.0-or-later"

PV = "3.23.4"

RPM_NAME = "solfege-3.23.4-5.8.aarch64.rpm"
RPM_HASH = "bdc1d5ea3e4045d87f339c51f642154ed0860dcfb310913b60a310dd82dd2e32921438bc66eb0c13dbc7da5627d79b816144f95b8dc067b9de7b354250ba113f"

RPROVIDES:${PN} += "config-solfege \
solfege"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
lilypond-fonts-common \
python3-gobject-Gdk \
timidity \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
typelib-Pango"

inherit rpm

SUMMARY = "An ear training program"
DESCRIPTION = "Solfege is an eartraining program for X written in python, using \
the GTK+ and GNOME libraries. To use this software you need some \
basic knowledge about music theory. Using solfege you can learn \
to recognise melodic and harmonic intervals, compare interval \
sizes, sing the intervals the computer asks for, identify chords, \
sing chords, scales, dictation and remember rhythmic patterns."
LICENSE = "GPL-3.0-or-later"

PV = "3.23.4"

RPM_NAME = "solfege-3.23.4-5.7.aarch64.rpm"
RPM_HASH = "584d291ebde6c01cd0fbd11352077abaebed8d131574fa46cf1188783ee5f3e7d831722e259cb79007618b74823393be3591f8ed6d0b5975c7afc2b1ddc2e4d0"

RPROVIDES:${PN} += "config-solfege \
solfege"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
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

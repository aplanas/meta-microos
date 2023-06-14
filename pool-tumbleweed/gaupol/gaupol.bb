SUMMARY = "GTK Subtitle editor"
DESCRIPTION = "Gaupol is an editor for text-based subtitle files. It supports multiple subtitle \
file formats and provides means of correcting texts and timing subtitles to match \
video. The user interface is designed with attention to batch processing of \
multiple documents and convenience of translating. \
 \
Gaupol should run on all Unix-like (GNU/Linux, *BSD, etc.) operating systems and \
on Windows. Technically it should be able to run on Mac as well, but that has \
not been tested nor made convenient. Gaupol's user interface is based on the GTK+ \
toolkit and has been designed to best fit the GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "1.12"

RPM_NAME = "gaupol-1.12-1.3.noarch.rpm"
RPM_HASH = "f87adad4d700dfe54da237ff83ad4a6e688e76abee2550b2857205d43678b547e97d797d02c0fe8a8fb54c5e6abe5e4e2045b5be37952d17ff49b5ee14d88c2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gaupol \
python3.10dist-gaupol \
python3dist-gaupol"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python3 \
python3-aeidon \
python3-gobject \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gspell \
typelib-Gst \
typelib-GstPbutils \
typelib-GstTag \
typelib-Gtk \
typelib-Pango"

inherit rpm

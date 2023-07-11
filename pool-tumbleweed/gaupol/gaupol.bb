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

RPM_NAME = "gaupol-1.12-1.4.noarch.rpm"
RPM_HASH = "e89ea6bf0b2afcfbe1601aa0d3d4c6dd8b2631d92c98b1e4919c67152550d96392bf79d073237577c386558fa2dad358b401b83d16ac7d1283549dd652c316eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gaupol \
python3.11dist-gaupol \
python3dist-gaupol"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
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

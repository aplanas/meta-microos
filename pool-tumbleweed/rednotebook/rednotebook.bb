SUMMARY = "Graphical diary and journal"
DESCRIPTION = "RedNotebook is a graphical journal to keep track of notes and thoughts. \
It includes a calendar navigation, customizable templates, export \
functionality and word clouds. You can also format, tag and search your \
entries."
LICENSE = "GPL-3.0-or-later"

PV = "2.29.6"

RPM_NAME = "rednotebook-2.29.6-1.2.noarch.rpm"
RPM_HASH = "a15d48f4ef6c70628b87c3ea0ea6b1ac3306d4e4e528d47def2ecf3a4f02d2b1e351b685564652aae484f96ef52562ce96dc7aa6b0160b11447b435e191da273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rednotebook \
python3dist-rednotebook \
rednotebook"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-gobject-Gdk \
typelib-GIRepository \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango \
typelib-WebKit2"

inherit rpm

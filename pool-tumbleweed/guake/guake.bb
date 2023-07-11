SUMMARY = "Drop-down terminal for GNOME"
DESCRIPTION = "Guake is a dropdown terminal made for the GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "guake-3.10-1.1.noarch.rpm"
RPM_HASH = "c312500581da8c3156aaf317efe845f79f76a3f1146cf04577417be751e77f8cc43c1646e156a3af2cf41b792359eb463c778d11a1e36bf9cbe259eb7d2914d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guake \
python3.11dist-guake \
python3dist-guake"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
libutempter0 \
python-abi \
python3-cairo \
python3-dbus-python \
python3-gobject-Gdk \
python3-pyaml \
python3-typing \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Keybinder \
typelib-Notify \
typelib-Pango \
typelib-Vte \
typelib-Wnck"

inherit rpm

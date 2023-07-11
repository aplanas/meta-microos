SUMMARY = "User profile configuration utility"
DESCRIPTION = "Mugshot is a user configuration utility that allows \
updating personal user details and avatar."
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "mugshot-0.4.3-1.11.noarch.rpm"
RPM_HASH = "e54513f5d3790df1094df8d88ddf46d07ba59afbc3be26f6a3a516007a223d257558c6f5489974fa9185720086aa8c7aa545d507f4434b634a35b46d3e5e3f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mugshot \
python3.11dist-mugshot \
python3dist-mugshot"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3 \
python3-base \
python3-cairo \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-pexpect \
typelib-Cheese \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-Gtk \
typelib-GtkClutter"

inherit rpm

SUMMARY = "Eog fullscreenbg plugin"
DESCRIPTION = "The Eye of Gnome Fullscreen Background plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-fullscreenbg-44.0-1.2.aarch64.rpm"
RPM_HASH = "7031264824ac9a4d40369e4d4878b32c0b1fd107f21a0cc0e5a5812bbf7850dec6c2f8423b76bd4394316c06208be484eef544ba093ea3d10480f7f3fab617d2"

RPROVIDES:${PN} += "eog-plugin-fullscreenbg \
eog-plugins-/usr/lib64/eog/plugins/fullscreenbg.plugin"

RDEPENDS:${PN} += "eog-plugins-data \
typelib-Eog \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-PeasGtk"

inherit rpm

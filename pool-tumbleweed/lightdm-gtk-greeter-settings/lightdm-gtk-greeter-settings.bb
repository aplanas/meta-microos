SUMMARY = "Settings editor for the LightDM GTK+ Greeter"
DESCRIPTION = "A dialog for allowing users to modify the settings of lightdm-gtk-greeter."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "lightdm-gtk-greeter-settings-1.2.2-1.14.noarch.rpm"
RPM_HASH = "914229d8b416720dbbea82f880bd5d6b24887d49d6094a632e86cbc42ac86345adc8f1cf53d3e74db683f8faafae2c274326afd561eefca01790e1e03f5fd529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(lightdm-gtk-greeter-settings.desktop) \
lightdm-gtk-greeter-settings \
python3.10dist(lightdm-gtk-greeter-settings) \
python3dist(lightdm-gtk-greeter-settings)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
lightdm-gtk-greeter \
python(abi) \
python3 \
python3-gobject-Gdk \
typelib(GLib) \
typelib(GObject) \
typelib(Gtk) \
typelib(Pango)"

inherit rpm

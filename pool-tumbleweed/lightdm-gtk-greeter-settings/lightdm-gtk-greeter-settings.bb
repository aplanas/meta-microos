SUMMARY = "Settings editor for the LightDM GTK+ Greeter"
DESCRIPTION = "A dialog for allowing users to modify the settings of lightdm-gtk-greeter."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "lightdm-gtk-greeter-settings-1.2.2-1.15.noarch.rpm"
RPM_HASH = "985b9025cbb7de99b2f54fe32392a4165c19990afad0c01b9d384c7a5a3badb73af24faecb1c85c8aff973a206d2ba1af36ad272e49c17f4dfb5bfea8dd5bbb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-gtk-greeter-settings \
python3.11dist-lightdm-gtk-greeter-settings \
python3dist-lightdm-gtk-greeter-settings"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
lightdm-gtk-greeter \
python-abi \
python3 \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gtk \
typelib-Pango"

inherit rpm

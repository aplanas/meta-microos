SUMMARY = "A tool to customize advanced GNOME 3 options"
DESCRIPTION = "GNOME Tweak Tool is an application for changing the advanced settings \
of GNOME 3."
LICENSE = "CC0-1.0 & GPL-3.0-or-later"

PV = "42.beta+60"

RPM_NAME = "gnome-tweaks-42.beta+60-1.1.noarch.rpm"
RPM_HASH = "66f096d9ef1a08714169c104936151b5989469974b5c72266144052484c6ea7131bc97e3534b5b3d8be07bd667916887fcdd60dc3fd5c99cef6b64029eec645d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.gnome.tweaks.desktop) \
gnome-tweak-tool \
gnome-tweaks \
metainfo() \
metainfo(org.gnome.tweaks.appdata.xml)"

RDEPENDS:${PN} += "/usr/bin/python3 \
gnome-settings-daemon \
gnome-shell \
gsettings-desktop-schemas \
mutter \
python(abi) \
python3-gobject \
python3-gobject-Gdk \
python3-xml \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gio) \
typelib(GnomeDesktop) \
typelib(Gtk) \
typelib(Handy) \
typelib(Notify) \
typelib(Pango)"

inherit rpm

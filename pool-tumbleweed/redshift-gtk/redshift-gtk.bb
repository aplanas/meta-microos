SUMMARY = "Gtk frontend for redshift"
DESCRIPTION = "A graphical user interface for the redshift tool that integrates into Gtk+ and GNOME."
LICENSE = "GPL-3.0-only"

PV = "1.12"

RPM_NAME = "redshift-gtk-1.12-7.10.aarch64.rpm"
RPM_HASH = "f58879edd35e7cb7f94c35a47afc6f52434ad25ea44d983a046726f6839d0a8397601115fda7ba3ee96ce18402a030cd0ea3eb02bbba79580e30beed9c1c76f3"

RPROVIDES:${PN} += "application() \
application(redshift-gtk.desktop) \
metainfo() \
metainfo(redshift-gtk.appdata.xml) \
redshift-gtk \
redshift-gtk(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
hicolor-icon-theme \
python(abi) \
python3-gobject-Gdk \
redshift \
systemd \
typelib(AppIndicator3) \
typelib(GLib) \
typelib(GObject) \
typelib(Gtk)"

inherit rpm

SUMMARY = "Gtk frontend for redshift"
DESCRIPTION = "A graphical user interface for the redshift tool that integrates into Gtk+ and GNOME."
LICENSE = "GPL-3.0-only"

PV = "1.12"

RPM_NAME = "redshift-gtk-1.12-7.11.aarch64.rpm"
RPM_HASH = "18a8e1b52634112d18b1eb7beaf3152023d850c1bedb75b3fc380ac51cfd93276e0672f6784ac89b8460be9c9128bff0d03cb7e3b38ceb401aece8b84f617780"

RPROVIDES:${PN} += "redshift-gtk"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
hicolor-icon-theme \
python-abi \
python3-gobject-Gdk \
redshift \
systemd \
typelib-AppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-Gtk"

inherit rpm

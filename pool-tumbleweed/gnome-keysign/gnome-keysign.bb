SUMMARY = "GNOME OpenGPG key signing helper"
DESCRIPTION = "Its purpose is to ease signing other peoples' keys. It is similar \
to caff, PIUS, or monkeysign. In fact, it is influenced a lot by \
these tools and either reimplements ideas or reuses code. \
Consider either of the aboved mentioned tools when you need a much \
more mature codebase."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.7.2"

RPM_NAME = "gnome-keysign-0.9.7.2-2.11.aarch64.rpm"
RPM_HASH = "f7d68d0ed55bc8c34402e2cdf16af1f323daf4a09040874adac1f77c628d85558dfd4708491c2bf30e56c4160c3bf778436026384294afec23f1309d67ab929f"

RPROVIDES:${PN} += "gnome-keysign \
python3.11dist-gnome-keysign \
python3dist-gnome-keysign"

RDEPENDS:${PN} += "/usr/bin/python3 \
gstreamer1 \
python-abi \
python3-Twisted \
python3-avahi \
python3-cairo \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-gpg \
python3-pybluez \
python3-qrcode \
python3-requests \
python3-setuptools \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstVideo \
typelib-Gtk \
typelib-Pango"

inherit rpm

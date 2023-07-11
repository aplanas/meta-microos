SUMMARY = "A simple and powerful dual-screen PDF reader designed for presentations"
DESCRIPTION = "Pympress is a PDF presentation tool designed for dual-screen setups such as \
presentations and public talks. \
 \
Highly configurable, fully-featured, and portable, pympress comes with many \
great features, including: \
- supports embedded gifs, video, and audio \
- text annotations displayed in the presenter window \
- natively supports beamer's “notes on second screen”, as well as Libreoffice \
  notes pages \
- and much more"
LICENSE = "GPL-2.0-or-later"

PV = "1.8.3"

RPM_NAME = "pympress-1.8.3-1.2.noarch.rpm"
RPM_HASH = "bce632f9f0eb519fd2972b4599b5524b47551733e42e29dd7d7fc69111b3f52db9357e8329da16c1ddd34aacb5ecf09ee07b20c3da5b50c8c7d180b73163acd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pympress \
python3.11dist-pympress \
python3dist-pympress"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
gobject-introspection \
gstreamer \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-good-gtk \
gtk3 \
permissions \
python-abi \
python3-gobject \
python3-watchdog \
typelib-DBus \
typelib-DBusGLib \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstAllocators \
typelib-GstApp \
typelib-GstAudio \
typelib-GstVideo \
typelib-Gtk \
typelib-Poppler \
typelib-cairo"

inherit rpm

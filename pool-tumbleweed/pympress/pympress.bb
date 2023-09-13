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

PV = "1.8.4"

RPM_NAME = "pympress-1.8.4-1.1.noarch.rpm"
RPM_HASH = "fe48e9a68210793c1cd3ac405671c62f77ab19c0d8c5ae298b2556974e17c29a3489a6429ce472fe8d9a55496c8ead984586707b0551ea8ed0e1310967873f46"
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

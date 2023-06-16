SUMMARY = "A Video Transcoder"
DESCRIPTION = "Transmageddon is a video transcoder for Linux and Unix systems \
built using GStreamer. It supports almost any format as its input \
and can generate a very large host of output files. The goal of the \
application was to help people to create the files they need to be \
able to play on their mobile devices and for people not hugely \
experienced with multimedia to generate a multimedia file without \
having to resort to command line tools with ungainly syntaxes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "transmageddon-1.5-5.6.noarch.rpm"
RPM_HASH = "a72b9a07f0449de553a8af49f4ae77473cb5b0adb2f2c1fa0c3da4aebbd75e2f82f3b138b8b44deec96fc958eb966b22379677924742261265b43ffb08b06ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "transmageddon"

RDEPENDS:${PN} += "/usr/bin/bash \
gstreamer-plugins-base \
python3 \
python3-gobject \
typelib-GLib \
typelib-GObject \
typelib-GUdev \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gst \
typelib-GstPbutils \
typelib-GstTag \
typelib-Gtk \
typelib-Notify"

inherit rpm

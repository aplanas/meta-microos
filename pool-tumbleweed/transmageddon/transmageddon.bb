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

RPM_NAME = "transmageddon-1.5-5.7.noarch.rpm"
RPM_HASH = "73bd9e444093126768e5fb8bc27ad370e19fccdf7e14627e541ea124ce97cc23dfd966c614a8ff0ec856c0bf7713a49ba7f69e3df8b779ffbc1b9611460a92f1"
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

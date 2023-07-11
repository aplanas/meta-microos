SUMMARY = "Video editing software"
DESCRIPTION = "Pitivi is a non-linear, featureful movie editor. \
It supports realtime trimming previews, ripple and roll editing, \
grouping and snapping, realtime assets management and searching, \
playhead-centric zooming and editing, non-modal cutting, detachable \
interface components, smooth scrolling, and automatic zoom \
adjustment."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.03"

RPM_NAME = "pitivi-2023.03-1.2.aarch64.rpm"
RPM_HASH = "58fea6277fd754f7e58db2eeead0ec0b076636e6702f305c2d07fb9142ff6f1a285b6d40d0d6fecc27d3bf75a925e6ca7ba93f89c1fdb4f0a8acd7786b8988dc"

RPROVIDES:${PN} += "pitivi"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gstreamer-transcoder \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpython3.11.so.1.0 \
python3-cairo \
python3-gobject \
python3-gst \
python3-librosa \
python3-matplotlib-gtk3 \
python3-numpy \
python3-opencv \
typelib-1-0-GES-1-0 \
typelib-1-0-Gst-1-0 \
typelib-GES \
typelib-GLib \
typelib-GObject \
typelib-GSound \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gst \
typelib-GstController \
typelib-GstPbutils \
typelib-GstTranscoder \
typelib-GstValidate \
typelib-GstVideo \
typelib-Gtk \
typelib-Notify \
typelib-Pango \
typelib-PangoCairo \
typelib-Peas \
typelib-Wnck"

inherit rpm

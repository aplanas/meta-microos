SUMMARY = "GStreamer Editing Services - Libraries"
DESCRIPTION = "The GStreamer multimedia framework and the accompanying GNonLin set \
of plugins for non-linear editing offer all the building blocks \
for: \
Decoding and encoding to a wide variety of formats, through all the \
available GStreamer plugins. \
Easily choosing segments of streams and arranging them through time \
through the GNonLin set of plugins. \
 \
But all those building blocks only offer stream-level access, which \
results in developers who want to write non-linear editors to write \
a consequent amount of code to get to the level of non-linear \
editing notions which are closer and more meaningful for the \
end-user (and therefore the application). \
 \
The GStreamer Editing Services (hereafter GES) aims to fill the gap \
between GStreamer/GNonLin and the application developer by offering \
a series of classes to simplify the creation of many kind of \
editing-related applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libges-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "dc4e8f99bcf0a4a2a8661d5cbdcb02912c2723370010334b5a075d9d2070ae75f64fb8c7c5ac072417546f2a1094a9cc9e313f72632c087fff7c5439dcbbfe74"

RPROVIDES:${PN} += "gstreamer1(element-gesdemux)()(64bit) \
gstreamer1(element-gessrc)()(64bit) \
gstreamer1(element-nlecomposition)()(64bit) \
gstreamer1(element-nleoperation)()(64bit) \
gstreamer1(element-nlesource)()(64bit) \
gstreamer1(element-nleurisource)()(64bit) \
gstreamer1(urisource-ges)()(64bit) \
libges-1.0.so.0()(64bit) \
libges-1_0-0 \
libges-1_0-0(aarch-64) \
libgstges.so()(64bit) \
libgstnle.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstcontroller-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvalidate-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
libxml2.so.2()(64bit) \
typelib(GES) \
typelib(GLib) \
typelib(GObject) \
typelib(Gst)"

inherit rpm

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

PV = "1.22.5"

RPM_NAME = "libges-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "2598102a05fa8df30489e298b6ce7582ae0564fd80d07809f0b2671f7f813d39f8ff8643d68639e753e384d00d76c531b530e3094bb8f805053ae403fe03f549"

RPROVIDES:${PN} += "gstreamer1 \
libges-1-0-0 \
libges-1.0.so.0 \
libgstges.so \
libgstnle.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvalidate-1.0.so.0 \
libgstvideo-1.0.so.0 \
libpython3.11.so.1.0 \
libxml2.so.2 \
typelib-GES \
typelib-GLib \
typelib-GObject \
typelib-Gst"

inherit rpm

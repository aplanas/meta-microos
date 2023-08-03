SUMMARY = "GStreamer Editing Services"
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
LICENSE = "LGPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-editing-services-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "4572a586838e70191920e9df9d63ca36f169c068cab0cf9623b6e0365f04f5d6c98ac1e45e8a9e704c4fbf1e11994c35b531949e3991de55889c19f5c7286a1f"

RPROVIDES:${PN} += "gstreamer-editing-services"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libges-1.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvalidate-1.0.so.0 \
libgstvideo-1.0.so.0 \
python-abi \
typelib-GObject \
typelib-Gst"

inherit rpm

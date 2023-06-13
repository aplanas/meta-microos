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
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GES-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "51adc59309832c743d2d62d1310dc16fae5e4f97269b444087f68814499b75cf7889b02ab30e8869080318e19510dc24dce61f982b5713d0136c11eb9157d509"

RPROVIDES:${PN} += "typelib(GES) \
typelib-1_0-GES-1_0 \
typelib-1_0-GES-1_0(aarch-64)"

RDEPENDS:${PN} += "libges-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gio) \
typelib(Gst) \
typelib(GstAudio) \
typelib(GstBase) \
typelib(GstPbutils) \
typelib(GstVideo)"

inherit rpm

SUMMARY = "GObject introspection files for the Rygel RendererGst library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelRendererGst-2_8-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "e5cfe70ab48b724b49a4a9f0c1ba769fdd2b79b95c8c050a1269f54d49c9d5a1891832c7743a024b317e90aebc25f406f9878791ba76183538eddc464f62a102"

RPROVIDES:${PN} += "typelib-1-0-RygelRendererGst-2-8 \
typelib-RygelRendererGst"

RDEPENDS:${PN} += "typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GSSDP \
typelib-GUPnP \
typelib-GUPnPAV \
typelib-Gee \
typelib-Gio \
typelib-Gst \
typelib-RygelCore \
typelib-RygelRenderer \
typelib-Soup \
typelib-libxml2"

inherit rpm

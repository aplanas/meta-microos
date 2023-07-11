SUMMARY = "GObject introspection files for the Rygel RendererGst library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelRendererGst-2_8-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "dc8c021704431d5ce0d1b30bc9bbbd93db66f5212d57aa540e31fe92ed4555095b566672d301a81ab6a81781f63b36c635148b5ae88eb06c14713df6d9216542"

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

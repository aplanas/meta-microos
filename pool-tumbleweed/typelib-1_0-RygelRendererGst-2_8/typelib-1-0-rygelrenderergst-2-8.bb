SUMMARY = "GObject introspection files for the Rygel RendererGst library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "typelib-1_0-RygelRendererGst-2_8-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "6eaf1c72f01a3b15748aeffea91ae7e8c669ef650e2422da1b62eb1a70a7583f037b302a8db69239c56ec03208e2ebf55f158b6c5dc4a954d209cbc2d6e8eff7"

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

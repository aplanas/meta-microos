SUMMARY = "GObject introspection files for the Rygel RendererGst library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelRendererGst-2_8-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "d0f80f19811a1a3a00f51beaeaa9781efb340fe3ee6dfda2178b5464e054d9c42bdcf36a01a93374ff1e409d2e8f2292e1ece9ef020646d9b9840633fbe9d50f"

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

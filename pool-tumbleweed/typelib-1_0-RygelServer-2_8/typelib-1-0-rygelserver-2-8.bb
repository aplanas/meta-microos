SUMMARY = "GObject introspection files for the Rygel server library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelServer-2_8-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "cd11bc46e586e8a18c0f0672d2e3bebecedce34318004eb88f8c620d22c5c9707537d11ee208bc918d5a6caaa8c7338c7d5dda3f8d8a9c21ab9a453923ed0e46"

RPROVIDES:${PN} += "typelib(RygelServer) \
typelib-1_0-RygelServer-2_8 \
typelib-1_0-RygelServer-2_8(aarch-64)"

RDEPENDS:${PN} += "typelib(GLib) \
typelib(GObject) \
typelib(GSSDP) \
typelib(GUPnP) \
typelib(GUPnPAV) \
typelib(Gee) \
typelib(Gio) \
typelib(RygelCore) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm

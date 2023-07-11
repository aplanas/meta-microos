SUMMARY = "GObject introspection files for the Rygel core library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelCore-2_8-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "0b84c2085f15756dcd137652c8809e8fe8045e797972f9314475fa33fc5257f08a569e87584e06d97d28226dee70aee85dcaa8f9e06ca65669fddea7d4f20c8a"

RPROVIDES:${PN} += "typelib-1-0-RygelCore-2-8 \
typelib-RygelCore"

RDEPENDS:${PN} += "typelib-GLib \
typelib-GObject \
typelib-GSSDP \
typelib-GUPnP \
typelib-Gee \
typelib-Gio \
typelib-Soup \
typelib-libxml2"

inherit rpm

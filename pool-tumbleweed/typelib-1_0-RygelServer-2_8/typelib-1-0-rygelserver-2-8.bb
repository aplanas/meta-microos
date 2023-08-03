SUMMARY = "GObject introspection files for the Rygel server library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelServer-2_8-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "bdf40546cb0ee63fce6b2b292131166a0b52195bb82d17cc40bcd9690971de014a34a7b4e48d0c9140c5ac7a442a8627616978d95ba621031705a697750d09dd"

RPROVIDES:${PN} += "typelib-1-0-RygelServer-2-8 \
typelib-RygelServer"

RDEPENDS:${PN} += "typelib-GLib \
typelib-GObject \
typelib-GSSDP \
typelib-GUPnP \
typelib-GUPnPAV \
typelib-Gee \
typelib-Gio \
typelib-RygelCore \
typelib-Soup \
typelib-libxml2"

inherit rpm

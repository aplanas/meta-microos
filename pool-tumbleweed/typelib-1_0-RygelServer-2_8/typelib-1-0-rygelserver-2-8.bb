SUMMARY = "GObject introspection files for the Rygel server library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelServer-2_8-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "b9fcf8943440ee75268d0a14360f8b335206b776ffdf4e861b1983e8e948eef8226f9879ca985728c5c6f9aebac3cb2a8d739b3f7a2c7af041886909b9a50233"

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

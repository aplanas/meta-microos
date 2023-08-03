SUMMARY = "GObject introspection files for the Rygel renderer library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelRenderer-2_8-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "9cd527921b3eb77aed90be3b03cbac4649df26f9670ea6ca691a66aa3ee2476f6cdf49cb6495853ecf8eaf6deee14f8592b6d7febb5b3d6de3de2334e16ff030"

RPROVIDES:${PN} += "typelib-1-0-RygelRenderer-2-8 \
typelib-RygelRenderer"

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

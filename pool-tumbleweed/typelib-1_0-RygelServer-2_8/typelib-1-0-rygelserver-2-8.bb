SUMMARY = "GObject introspection files for the Rygel server library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "typelib-1_0-RygelServer-2_8-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "eb2f903b9e381f795b90bb584057291da0a1d8efc1eadd794ffc71ff25d1a595c1063679f537dc7e2a0a40c93b682200734b5538e0f5b15a213e7489fb6dac0d"

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

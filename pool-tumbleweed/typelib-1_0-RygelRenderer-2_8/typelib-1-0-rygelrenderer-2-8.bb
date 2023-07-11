SUMMARY = "GObject introspection files for the Rygel renderer library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelRenderer-2_8-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "16a84f7757bb17252efedb5d0d867161ed80320148068bd49a34cb5440112690bd3787547a8e7a7f592f5c5f84074d64962d7d1e146e55a3b74bab2e8bc5e08f"

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

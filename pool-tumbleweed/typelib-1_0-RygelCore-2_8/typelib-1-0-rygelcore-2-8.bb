SUMMARY = "GObject introspection files for the Rygel core library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelCore-2_8-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "0467118d9fab29b11753e8256e0c2148d648b8b917343b826ad372a9f8646b0cc1e88830371bfe281784d09d3f690fb61cd2ed903cd2de8d71c411d8e9676460"

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

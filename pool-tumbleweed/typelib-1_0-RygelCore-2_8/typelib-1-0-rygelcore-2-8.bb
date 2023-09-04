SUMMARY = "GObject introspection files for the Rygel core library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "typelib-1_0-RygelCore-2_8-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "68788250a8bf596cdd2901e6050db038ddba5dbf5e5ac1ba94e68a784bfe79f4ecf7bb7b17a0d023f3b9dc05d1f85c591742bae018f45cd3e798cd1d507291f0"

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

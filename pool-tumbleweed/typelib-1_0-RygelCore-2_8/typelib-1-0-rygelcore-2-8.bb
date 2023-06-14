SUMMARY = "GObject introspection files for the Rygel core library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "typelib-1_0-RygelCore-2_8-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "50caeefeda534e8e38f8318224d6a1c083042f4447d4ab6fcd1e5d6c0465244469bff65635a07908a5b0b4e4cbfe44968c7c6ebc33f6a259106f68a1972f88e2"

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

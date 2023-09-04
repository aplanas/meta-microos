SUMMARY = "GObject introspection files for the Rygel renderer library"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "typelib-1_0-RygelRenderer-2_8-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "882251e86d812174c7364f8c9461fc8188b86543f12c206b12fdd12cecd8e4b88d054747cc5cccd9bb68c774a38d4d8c7ebadd0b7ab8a2a0cc5e39e478105344"

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

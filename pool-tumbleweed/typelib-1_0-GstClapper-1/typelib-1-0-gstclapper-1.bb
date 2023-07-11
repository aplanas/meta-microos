SUMMARY = "Clapper library typelib"
DESCRIPTION = "Clapper library typelib."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "typelib-1_0-GstClapper-1-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "a9a00122275058f73fdc6cd787d6064bb17780fa7e899706a3b88c98a03c39f1c8f1f3915d6941c219004c37f197437593bfbab1e8f315d5a7d495bcddf1b622"

RPROVIDES:${PN} += "typelib-1-0-GstClapper-1 \
typelib-GstClapper"

RDEPENDS:${PN} += "libgstclapper-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstTag \
typelib-GstVideo"

inherit rpm

SUMMARY = "Clapper library typelib"
DESCRIPTION = "Clapper library typelib."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "typelib-1_0-GstClapper-1-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "ec538064bfbc41988745c6bc9e3b8dde4d24146010a2cfff89c083e409850d2caa79d4e3a0f14f9b95670c09731c72b124d6546f9824804bd3a5151b0c2c7a72"

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

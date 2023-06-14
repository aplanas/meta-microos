SUMMARY = "Plugin for GIMP providing support for the DDS format"
DESCRIPTION = "This GIMP plugin allows to load and save images in the Direct Draw \
Surface (DDS) format."
LICENSE = "GPL-2.0+"

PV = "3.0.1"

RPM_NAME = "gimp-plugin-dds-3.0.1-3.32.aarch64.rpm"
RPM_HASH = "c527426a296af6d1eb4600df09c08fe6a98175a6e12f2b1db0437f861701b2680ac1f96670a60cc718345809d17305658d9629986981f2c6e565c95ed2fdf44c"

RPROVIDES:${PN} += "gimp-plugin-dds"

RDEPENDS:${PN} += "gimp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgimp-2.0.so.0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm

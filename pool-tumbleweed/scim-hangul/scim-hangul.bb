SUMMARY = "Hangul Input Method Engine for SCIM"
DESCRIPTION = "Hangul Input Method Engine for SCIM"
LICENSE = "GPL-2.0+"

PV = "0.4.0+git20140408.ee1d084"

RPM_NAME = "scim-hangul-0.4.0+git20140408.ee1d084-1.31.aarch64.rpm"
RPM_HASH = "28b7f32efdf4de27e6c30e80ddf6f2d38b3d57db88e403b4327ddf4b2d45b1cde13e0730c4b9fa5d9cb1c6df98d5de4463e7467abcc82b200d226b6bab411ec9"

RPROVIDES:${PN} += "scim-hangul"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhangul.so.1 \
libscim-1.0.so.8 \
libscim-gtkutils-1.0.so.8 \
libstdc++.so.6"

inherit rpm

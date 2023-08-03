SUMMARY = "An Image Viewer"
DESCRIPTION = "Viewnior is an image viewer program with a minimal interface. \
Its features are: \
 \
* Fullscreen & Slideshow \
* Rotate, flip, save, delete images \
* Animation support \
* Browse only selected images \
* Navigation window \
* Simple interface \
* Configurable mouse actions"
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "viewnior-1.8-2.1.aarch64.rpm"
RPM_HASH = "087bf5addefd623802e2a7110ab69c72c34207b014796d115a7b78d325f753df4daa16efe2abaf11f0d6af0007dbd21b5b00d5928c87b08b0bf857a3915671f3"

RPROVIDES:${PN} += "viewnior"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6"

inherit rpm

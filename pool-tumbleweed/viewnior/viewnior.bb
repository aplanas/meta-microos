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

RPM_NAME = "viewnior-1.8-1.7.aarch64.rpm"
RPM_HASH = "80b9480c8fba8abfa4f1522604a478dd3ff959f878e653223ad9dd063c0805b359c751688fddd6a538617badc07f3946112503be09f62da9376711cf1f32352f"

RPROVIDES:${PN} += "viewnior"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.27 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libstdc++.so.6"

inherit rpm

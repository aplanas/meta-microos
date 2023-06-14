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

RPM_NAME = "viewnior-1.8-1.6.aarch64.rpm"
RPM_HASH = "c8f24e38ea931d8415bdae0520a3e2817ddac032ca4ea7959c97553b1938efebd421e647a3f81f8bd07387f049e99df79d3d9b7a57c4cb3e7495cc518f0aaa1d"

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

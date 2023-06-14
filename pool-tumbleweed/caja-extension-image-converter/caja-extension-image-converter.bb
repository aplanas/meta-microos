SUMMARY = "Caja image converter"
DESCRIPTION = "ImageResizer adds a 'Resize Images...' menu item to the context \
menu of all images. This opens a dialog where you set the desired \
image size and file name. A click on 'Resize' finally resizes the \
image(s) using ImageMagick's convert tool."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-image-converter-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "cb5a67241d3058d3339c8b70294f5e0c205275d6a723ed79208edf812b7b65bf1f44afa1083946de53d23b5bb6c26d5545602abf852a8a3931fd504fc450bc77"

RPROVIDES:${PN} += "caja-extension-image-converter \
caja-image-converter \
libcaja-image-converter.so \
mate-file-manager-image-converter"

RDEPENDS:${PN} += "ImageMagick \
caja \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm

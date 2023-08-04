SUMMARY = "A multimedia file converter"
DESCRIPTION = "A program to convert your multimedia files to contemporary formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "ciano-0.2.4-1.24.aarch64.rpm"
RPM_HASH = "29be1616b58cbd4867ea6ae47bc0a2c2848b77cd90b697e86402b7e113259f329778a1c2b6d8807c919c64ff3de598e37c2ca8119ca50c7a71893cdf5db3bbc0"

RPROVIDES:${PN} += "ciano"

RDEPENDS:${PN} += "ImageMagick \
ffmpeg \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm

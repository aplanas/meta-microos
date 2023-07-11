SUMMARY = "Palm Pilot Image Viewer to PGM Converter"
DESCRIPTION = "Tools for converting Pilot Image Viewer pdb files to and from Portable \
Graymaps and Portable Bitmaps. The tools support grayscale and \
monochrome images with or without compression and with or without \
notes. \
 \
If you are looking for a cool (and free) image viewer for your Pilot, \
you should look at TinyViewer (http://www.righto.com/pilot/tv.html)."
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "imgvtopgm-2.0-700.7.aarch64.rpm"
RPM_HASH = "eaba42c4a07406c27a7d9e9c03d4b20aa7735d9ed7eeb27b5e20974df38235d4f943102d0e1e6f8352ef73bfd5f64d9cd477667ef3faa178e49bcc34eafc3b07"

RPROVIDES:${PN} += "imgvtopgm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetpbm.so.11 \
netpbm"

inherit rpm

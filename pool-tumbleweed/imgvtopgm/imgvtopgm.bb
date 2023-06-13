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

RPM_NAME = "imgvtopgm-2.0-700.6.aarch64.rpm"
RPM_HASH = "e28f284c6b2b6bf73600b9167505ed199db1ba26cee521991a8c1f6fb765005713188ced0e0c27f14853d290143e0c500015f528d4dc53f9d35c8df5aedb2808"

RPROVIDES:${PN} += "imgvtopgm \
imgvtopgm(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnetpbm.so.11()(64bit) \
netpbm"

inherit rpm

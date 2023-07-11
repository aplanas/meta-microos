SUMMARY = "Converts HP-GL Plotter Language into a Variety of Formats"
DESCRIPTION = "The hp2xx program is a versatile tool for converting vector graphics \
data given in Hewlett-Packard's HP-GL plotter language into a variety \
of popular graphics formats, both vector and raster."
LICENSE = "GPL-2.0+"

PV = "3.4.4"

RPM_NAME = "hp2xx-3.4.4-1.24.aarch64.rpm"
RPM_HASH = "0574e6212247c22e1dbbd3a485241b6e84cccc60b5513d969da8f9b8a0f19d9d682b339342822282a9f573de386f47388c634b27b8a327dcbe2f9fa04c23d59c"

RPROVIDES:${PN} += "hp2xx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm

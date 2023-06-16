SUMMARY = "Converts HP-GL Plotter Language into a Variety of Formats"
DESCRIPTION = "The hp2xx program is a versatile tool for converting vector graphics \
data given in Hewlett-Packard's HP-GL plotter language into a variety \
of popular graphics formats, both vector and raster."
LICENSE = "GPL-2.0+"

PV = "3.4.4"

RPM_NAME = "hp2xx-3.4.4-1.23.aarch64.rpm"
RPM_HASH = "d15eac24c70c81e217f3cd315a9b94a15d5a3a429fc2660d56c3f19f0014b3adce5afb96a56c791af5e418823be51c8bb7c440ff8265b747f7046acd352866fd"

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

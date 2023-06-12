SUMMARY = "Low-level DVD Authoring Tools"
DESCRIPTION = "dvdauthor is a program that will generate a DVD-Video movie from a \
valid MPEG-2 stream. To start you need MPEG-2 files that contain \
the necessary DVD-Video VOB packets. These can be generated with \
FFmpeg, or by by passing `-f 8` to `mplex`."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "dvdauthor-0.7.2-3.18.aarch64.rpm"
RPM_HASH = "40618e5e2fee44611fcbbd53ec907845d24226c196f0f89133cc2c185d890c9b5e5a2a657206ec749bed93f966ba40cc86fd51136bbc10bc57787c435ee903ad"

RPROVIDES:${PN} += "dvdauthor \
dvdauthor(aarch-64) \
dvdauthor07"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMagickCore-7.Q16HDRI.so.10()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdvdread.so.8()(64bit) \
libfreetype.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
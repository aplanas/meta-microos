SUMMARY = "Low-level DVD Authoring Tools"
DESCRIPTION = "dvdauthor is a program that will generate a DVD-Video movie from a \
valid MPEG-2 stream. To start you need MPEG-2 files that contain \
the necessary DVD-Video VOB packets. These can be generated with \
FFmpeg, or by by passing `-f 8` to `mplex`."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "dvdauthor-0.7.2-3.19.aarch64.rpm"
RPM_HASH = "5a0e18e61a8e3f6e5c129e9611e3a7702236be7286ec94ae0b3cc6efc1ab9cbd31b801a99762f4359361741bf9f6ce4e73f60b21511a01e1cec4e406d0efde6c"

RPROVIDES:${PN} += "dvdauthor \
dvdauthor07"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libc.so.6 \
libdvdread.so.8 \
libfreetype.so.6 \
libfribidi.so.0 \
libm.so.6 \
libpng16.so.16 \
libxml2.so.2"

inherit rpm

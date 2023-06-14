SUMMARY = "Tools to Create, Alter, and Inspect Matroska Files"
DESCRIPTION = "Tools to create and manipulate Matroska files (extensions .mkv and .mka), a new \
container format for audio and video files. Includes command line tools \
mkvextract, mkvinfo, mkvmerge and mkvpropedit."
LICENSE = "GPL-2.0-or-later"

PV = "77.0"

RPM_NAME = "mkvtoolnix-77.0-1.1.aarch64.rpm"
RPM_HASH = "2b2cef84de427d3efe0d8fd8233e6b58d89d3817eaaf5d446ec77a77f0cc44064a373cf71e55664bc1ac714f5f270232b30135c41d72324c57e3133bfa8f7664"

RPROVIDES:${PN} += "mkvtoolnix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libQt6Core.so.6 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libdvdread.so.8 \
libebml.so.5 \
libfmt.so.9 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmatroska.so.7 \
libogg.so.0 \
libpugixml.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
libz.so.1"

inherit rpm

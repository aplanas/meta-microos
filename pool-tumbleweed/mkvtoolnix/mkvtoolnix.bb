SUMMARY = "Tools to Create, Alter, and Inspect Matroska Files"
DESCRIPTION = "Tools to create and manipulate Matroska files (extensions .mkv and .mka), a new \
container format for audio and video files. Includes command line tools \
mkvextract, mkvinfo, mkvmerge and mkvpropedit."
LICENSE = "GPL-2.0-or-later"

PV = "79.0"

RPM_NAME = "mkvtoolnix-79.0-1.1.aarch64.rpm"
RPM_HASH = "5b878245f186f5c365bde8a4b63fbe07d42d068a803eac9a76aab3ee2d1d0f1d343e2bceae717dcf4a6be7da9178dcf514d459e650fec4b11048e9bc50fa0129"

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

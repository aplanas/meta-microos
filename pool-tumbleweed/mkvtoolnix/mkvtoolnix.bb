SUMMARY = "Tools to Create, Alter, and Inspect Matroska Files"
DESCRIPTION = "Tools to create and manipulate Matroska files (extensions .mkv and .mka), a new \
container format for audio and video files. Includes command line tools \
mkvextract, mkvinfo, mkvmerge and mkvpropedit."
LICENSE = "GPL-2.0-or-later"

PV = "78.0"

RPM_NAME = "mkvtoolnix-78.0-1.1.aarch64.rpm"
RPM_HASH = "d38e4ccdf9da607a9b35e5484fa9605c942cb7c0ef3917d0652f0728534e6134e4bf88f5ac72a3908a53b4df93d521bd0edc6e4281b5ea19a20f04d6bb09a40e"

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
